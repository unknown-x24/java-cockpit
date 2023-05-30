package com.bhandari.cockpitback.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bhandari.cockpitback.Model.Product;

@Service
public class CockpitServiceImpl {
	
	ArrayList<Product> prod = new ArrayList<>();
	
	public CockpitServiceImpl() {
		prod.add(new Product("1", "Lipstick", 5000));
		prod.add(new Product("2", "Something", 9999));
		prod.add(new Product("3", "Shoes", 100));
		prod.add(new Product("4", "Typewriter", 100));
		prod.add(new Product("5", "Cat", 100));
		prod.add(new Product("6", "Mate", 100));
		prod.add(new Product("7", "Vase", 100));
		prod.add(new Product("8", "COMBnLEAVES", 100));
		prod.add(new Product("9", "Shorts", 100));
		prod.add(new Product("10", "Pencil", 100));
		prod.add(new Product("11", "Ancient Teapot", 100));
		prod.add(new Product("12", "Bonsai", 100));
		
	}

	public ArrayList<Product> getProducts() {
		// TODO Auto-generated method stub
		return prod;
	}
	
	

}
