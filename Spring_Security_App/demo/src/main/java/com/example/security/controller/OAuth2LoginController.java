package com.example.security.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@RestController
@RequestMapping("/oauth2")
public class OAuth2LoginController {

    // This is a simple endpoint showing OAuth2 login result.
    @GetMapping("/login/success")
    public String oauth2Success(OAuth2AuthenticationToken authentication) {
        return "Logged in via: " + authentication.getAuthorizedClientRegistrationId();
    }
}
