package com.telusko.service;

import java.util.List;

import com.telusko.model.Tourist;

public interface ITouristService 
{
	String registerTourist(Tourist tourist);
	Tourist fetchTouristById(Integer id);
	List<Tourist> fetchAllTouristInfo();
	String updateTouristInfo(Tourist tourist);
	String updateTheTouristBudget(Integer id, Double budget);
	String deleteTouristInfoById(Integer id);

}
