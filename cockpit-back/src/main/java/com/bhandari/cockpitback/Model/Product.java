package com.bhandari.cockpitback.Model;

public class Product {
	
	private String productId;
	private String name;
	private long price;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public Product() {
		
	}
	
	public Product(String productId, String name, long price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

}
