package com.abc.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ship_to_price")
public class Price {
	
	
	String material_id;
	String ship_to_id;
	String ship_to_name;
	Float price;
	String availibility_status;
	
	public Price(String material_id, String ship_to_id, String ship_to_name, Float price, String availibility_status) {
		super();
		this.material_id = material_id;
		this.ship_to_id = ship_to_id;
		this.ship_to_name = ship_to_name;
		this.price = price;
		this.availibility_status = availibility_status;
	}
	
	public String getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(String material_id) {
		this.material_id = material_id;
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getAvailibility_status() {
		return availibility_status;
	}
	public void setAvailibility_status(String availibility_status) {
		this.availibility_status = availibility_status;
	}

	@Override
	public String toString() {
		return "Price [material_id=" + material_id + ", ship_to_id=" + ship_to_id + ", ship_to_name=" + ship_to_name
				+ ", price=" + price + ", availibility_status=" + availibility_status + "]";
	}
	

}
