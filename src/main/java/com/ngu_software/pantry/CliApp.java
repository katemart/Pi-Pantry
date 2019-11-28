package com.ngu_software.pantry;

import java.util.Date;
import java.util.List;

import com.ngu_software.pantry.model.Category;
import com.ngu_software.pantry.model.Product;
import com.ngu_software.pantry.model.StorageUnit;

public class CliApp {
	
	public static void main(String[] args) {
		Product p = new Product(Category.SNACK, "Lays chips", "derishious chips", new Date());
		StorageUnit su = new StorageUnit();
		
		List<Product> lp =  su.add(p);
		System.out.println(lp);
		
		System.out.println(p);
	}

}
