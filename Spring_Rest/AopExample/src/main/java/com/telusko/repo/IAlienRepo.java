package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.model.Alien;

@Repository
public interface IAlienRepo extends JpaRepository<Alien, Integer> {

}
