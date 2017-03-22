package com.sk.javab;

public class Product {
	String name;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=").append(name).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
}
