package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.telusko.exception.TouristNotFoundException;
import com.telusko.model.Tourist;
import com.telusko.repo.ITouristRepo;

@Service
@Scope("prototype") // current approach
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // older approach
public class TouristService implements ITouristService
{
	
	private ITouristRepo repo;
	
	
	
	public TouristService() {
		super();
		System.out.println("Tourist Service Bean created");
	}

	@Autowired
	public void setRepo(ITouristRepo repo) {
		this.repo = repo;
	}

	@Override
	public String registerTourist(Tourist tourist) 
	{
		Tourist tr=repo.save(tourist);
		return "Tourist Info Registered with id "+ tr.getId();
	}

	@Override
	public Tourist fetchTouristById(Integer id)
	{
//		Optional<Tourist> optional = repo.findById(id);
//		if(optional.isPresent())
//			return optional.get();
//		else
//			throw new TouristNotFoundException("Tourist with given id is not found");
		return repo.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist with given id is not found"));
	}

	@Override
	public List<Tourist> fetchAllTouristInfo()
	{
		
		return repo.findAll();
	}

	@Override
	public String updateTouristInfo(Tourist tourist) 
	{
		Optional<Tourist> optional = repo.findById(tourist.getId());
		if(optional.isPresent())
		{
			repo.save(tourist);
			return "Tourist info updated successfully";
		}
		throw new TouristNotFoundException("Tourist with given id is not found");
	}

	@Override
	public String updateTheTouristBudget(Integer id, Double budget) 
	{
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent())
		{
			Tourist tourist=optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Tourist info updated successfully";
			
		}
		throw new TouristNotFoundException("Tourist with given id is not found");
	}

	@Override
	public String deleteTouristInfoById(Integer id)
	{
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "Tourist record for the given id is deleted";
			
		}
		throw new TouristNotFoundException("Tourist with given id is not found");
	}

}
