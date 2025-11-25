package com.example.security.controller;

import com.example.security.model.AppUser;
import com.example.security.model.RefreshToken;
import com.example.security.repository.RefreshTokenRepository;
import com.example.security.repository.UserRepository;
import com.example.security.service.JwtService;
import com.example.security.service.RefreshTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RefreshTokenService refreshTokenService;

    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody Map<String,String> body) {
        AppUser user = AppUser.builder()
                .username(body.get("username"))
                .password(passwordEncoder.encode(body.get("password")))
                .role("ROLE_USER")
                .build();
        userRepository.save(user);
        return "registered";
    }

    @PostMapping("/login")
    public Map<String,String> login(@RequestBody Map<String,String> body) {
        Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(body.get("username"), body.get("password"))
        );
        String access = jwtService.generateToken(body.get("username"));
        AppUser user = userRepository.findByUsername(body.get("username")).get();
        RefreshToken refresh = refreshTokenService.createRefreshToken(user);
        return Map.of("accessToken", access, "refreshToken", refresh.getToken());
    }

    @PostMapping("/refresh")
    public Map<String,String> refresh(@RequestBody Map<String,String> body) {
        String rtoken = body.get("refreshToken");
        RefreshToken token = refreshTokenRepository.findByToken(rtoken).orElseThrow();
        if (!refreshTokenService.isValid(token)) throw new RuntimeException("Refresh token expired");
        String access = jwtService.generateToken(token.getUser().getUsername());
        return Map.of("accessToken", access);
    }

    @PostMapping("/logout")
    public String logout(@RequestBody Map<String,String> body) {
        AppUser user = userRepository.findByUsername(body.get("username")).orElseThrow();
        refreshTokenService.deleteByUser(user);
        return "logged out";
    }
}
