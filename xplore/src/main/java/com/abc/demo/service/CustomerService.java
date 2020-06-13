package com.abc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.demo.model.Customer;
import com.abc.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	 
	//Retrieve Operation
	 
	 public List<Customer> getAll(){
		 return customerRepo.findAll();
		 
	 }
	 
	 
	 
	
	

}
