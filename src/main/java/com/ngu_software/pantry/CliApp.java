package com.ngu_software.pantry;

import java.util.Date;

import com.ngu_software.pantry.model.Category;
import com.ngu_software.pantry.model.Product;

public class CliApp {
	
	public static void main(String[] args) {
		Product p = new Product(Category.SNACK, "Lays chips", "derishious chips", new Date());
		System.out.println(p);
	}

}
