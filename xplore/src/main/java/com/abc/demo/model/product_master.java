package com.abc.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_master")
public class product_master {
	
	String material_id;
	String description;
	String vendor_material_id;
	String vendor_name;
	String packaging;
	String sales_uom;
	String base_uom;
	
	public product_master(String material_id, String description, String vendor_material_id, String vendor_name,
			String packaging, String sales_uom, String base_uom) {
		super();
		this.material_id = material_id;
		this.description = description;
		this.vendor_material_id = vendor_material_id;
		this.vendor_name = vendor_name;
		this.packaging = packaging;
		this.sales_uom = sales_uom;
		this.base_uom = base_uom;
	}
	
	public String getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(String material_id) {
		this.material_id = material_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVendor_material_id() {
		return vendor_material_id;
	}
	public void setVendor_material_id(String vendor_material_id) {
		this.vendor_material_id = vendor_material_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getPackaging() {
		return packaging;
	}
	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
	public String getSales_uom() {
		return sales_uom;
	}
	public void setSales_uom(String sales_uom) {
		this.sales_uom = sales_uom;
	}
	public String getBase_uom() {
		return base_uom;
	}
	public void setBase_uom(String base_uom) {
		this.base_uom = base_uom;
	}

	@Override
	public String toString() {
		return "product_master [material_id=" + material_id + ", description=" + description + ", vendor_material_id="
				+ vendor_material_id + ", vendor_name=" + vendor_name + ", packaging=" + packaging + ", sales_uom="
				+ sales_uom + ", base_uom=" + base_uom + "]";
	}
	

}
