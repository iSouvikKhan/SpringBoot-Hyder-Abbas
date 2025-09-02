package com.telusko.SecurityApp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SecurityApp1.model.Users;

public interface IUserRepo extends JpaRepository<Users, String>
{

}
