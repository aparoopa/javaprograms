package com.abc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.demo.model.Customer;
import com.abc.demo.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	//private Environment env;
	private CustomerService customerService;
	private Customer bean;
	
	 @RequestMapping("/getcustomers")
	 public List<Customer> getAll(){
		// System.out.println(bean);
		//System.out.println( "property" + env.getProperty("spring.data.mongodb.uri")); 
		return customerService.getAll();
		 
	 }
	// @RequestMapping("dbName")
	/* String getDbName(){
		 return bean.getDbName();
	     
		
	 }*/

}

