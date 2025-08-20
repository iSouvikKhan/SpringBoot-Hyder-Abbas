package com.telusko.service;

import java.util.List;

import com.telusko.model.Alien;

public interface IAlienService 
{
	Alien registerAlien(Alien alien);
	List<Alien> getAllAliensInfo();

}
