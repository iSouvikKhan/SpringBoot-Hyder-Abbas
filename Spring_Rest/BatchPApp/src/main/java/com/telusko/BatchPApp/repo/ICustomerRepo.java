package com.telusko.BatchPApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.BatchPApp.model.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer>
{

}
