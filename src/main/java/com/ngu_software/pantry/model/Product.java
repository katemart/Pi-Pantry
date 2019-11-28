package com.ngu_software.pantry.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	
	private String barcode; // for barcode implementation with a reader
	private Category category;
	private String name;
	private String description;
	private Date date;
	
	public Product(String barcode, Category category, String name, String description, Date date) {
		super();
		this.barcode = barcode;
		this.category = category;
		this.name = name;
		this.description = description;
		this.date = date;
	}
	
	public Product(Category category, String name, String description, Date date) {
		this.barcode = null;
		this.category = category;
		this.name = name;
		this.description = description;
		this.date = date;
	}

	public String getBarcode() {
		return (barcode == null) ? "" : barcode;
	}
	
	public Category getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Date getDate() {
		return date;
	}
	
	public String getDateStr() {
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date);
	}

	@Override
	public String toString() {
		return "Product [barcode=" + barcode + ", name=" + name + ", description=" + description + ", date=" + date
				+ "]";
	}
	
}
