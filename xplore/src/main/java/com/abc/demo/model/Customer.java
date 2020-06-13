package com.abc.demo.model;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.env.Environment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	/*@Value("${spring.data.mongodb.uri}")
	private String dbName;
	//System.out.println("DB name is" + dbName);
	
	@Autowired
	private Environment environment;
	
	public String getDBName() {
		return environment.getProperty("spring.data.mongodb.uri");
	}*/

	
	@Id
	String id;
	String ship_to_id;
	String ship_to_name;
	
	
	public Customer(String id, String ship_to_id, String ship_to_name) {
		super();
		this.id = id;
		this.ship_to_id = ship_to_id;
		this.ship_to_name = ship_to_name;
		
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getShip_to_id() {
		return ship_to_id;
	}


	public void setShip_to_id(String ship_to_id) {
		this.ship_to_id = ship_to_id;
	}


	public String getShip_to_name() {
		return ship_to_name;
	}


	public void setShip_to_name(String ship_to_name) {
		this.ship_to_name = ship_to_name;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", ship_to_id=" + ship_to_id + ", ship_to_name=" + ship_to_name + "]";
	}
	
	
	

}
