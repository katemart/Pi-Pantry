package com.ngu_software.pantry.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	
	private String barcode;
	private String name;
	private String description;
	private Date date;
	
	public Product(String barcode, String name, String description, Date date) {
		this.barcode = barcode;
		this.name = name;
		this.description = description;
		this.date = date;
	}

	public String getBarcode() {
		return barcode;
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
