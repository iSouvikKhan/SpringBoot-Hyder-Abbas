package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Alien;
import com.telusko.repo.IAlienRepo;

@Service
public class AlienService implements IAlienService 
{
	
	@Autowired
	private IAlienRepo repo;

	@Override
	public Alien registerAlien(Alien alien)
	{
		
		return repo.save(alien);
	}

	@Override
	public List<Alien> getAllAliensInfo() 
	{
		
		return repo.findAll();
	}

}
