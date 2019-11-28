package com.ngu_software.pantry.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StorageUnit {
	
	// put in product that was scanned and get the list
	private HashMap<Product, List<Product>> productMap;
	
	public StorageUnit() {
		productMap = new HashMap<>();
	}
	
	public List<Product> add(Product p) {
		List<Product> productList;
		
		if (productMap.get(p) == null) {
			productList = new ArrayList<>();
			productMap.put(p, productList);
		} else {
			productList = productMap.get(p);
		}
		
		productList.add(p);
		
		return productList;
		
//		List<Product> productList = productMap.get(p) == null ? new ArrayList<Product>() : productMap.get(p);
//		List<Product> productList = productMap.get(p) == null ? productMap.put(p, new ArrayList<Product>()) : productMap.get(p);
//		productList.add(p);
//		return productList;
	}
	
	

}
