package com.ibm.shop;

public class Product {
	
	private int price;
	private String name;
	private static int stock;
	
	public Product() {
		
	}

	public Product(String name, int price, int stock) {
		super();
		this.price = price;
		this.name = name;
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
