package com.ngu_software.pantry.model;

import java.util.HashMap;
import java.util.List;

public class StorageUnit {
	
	// put in product that was scanned and get the list
	private HashMap<Product, List<Product>> productMap;
	
	public StorageUnit() {
		productMap = new HashMap<>();
	}
	
	

}
