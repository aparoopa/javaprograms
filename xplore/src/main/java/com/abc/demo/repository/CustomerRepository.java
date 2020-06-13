package com.abc.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abc.demo.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String>{
	
	

}
