package com.telusko.SecurityApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SecurityApp1.model.Users;
import com.telusko.SecurityApp1.repo.IUserRepo;

@Service
public class UserService 
{

	@Autowired
	private IUserRepo repo;
	
	public Users register(Users user)
	{
		return repo.save(user);
	}

}
