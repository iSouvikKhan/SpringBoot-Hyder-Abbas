package com.telusko.WebbAPPCRM.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.WebbAPPCRM.model.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
