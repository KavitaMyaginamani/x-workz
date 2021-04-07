package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.FoodType;

public class FoodItem {
	private String name;
	private double price;
	private FoodType type;
	private int quantity;
	private double discount;

	public FoodItem() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	

	public FoodItem(String name, double price, FoodType type, int quantity, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.discount = discount;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FoodDelivery [name=" + name + ", price=" + price + ", quantity=" + quantity + ", discount=" + discount
				+ "]";
	}
	

}
