package com.bhandari.cockpitback.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhandari.cockpitback.Model.Product;
import com.bhandari.cockpitback.Service.CockpitServiceImpl;

@RestController
public class CockpitController {
	
	@Autowired
	CockpitServiceImpl service;
	
	@GetMapping("/get")
	public ArrayList<Product> getProducts() {
		return service.getProducts();
	}

}
