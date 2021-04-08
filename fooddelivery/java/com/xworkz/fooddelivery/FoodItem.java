package com.xworkz.fooddelivery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooddelivery.constant.FoodType;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name="food_item")
public class FoodItem {
	
	@Id
	@Column(name="F_ID")
	private int id;
	@Column(name="NAME")
	@NonNull
	private String name;
	@Column(name="PRICE")
	@NonNull
	private double price;
	@NonNull
	@Column(name="TYPE")
	private FoodType type;
	@NonNull
	@Column(name="QUANTITY")
	private int quantity;
	@NonNull
	@Column(name="DISCOUNT")
	private double discount;

	public FoodItem() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public FoodItem(@NonNull String name, @NonNull double price, @NonNull FoodType type, @NonNull int quantity,
			@NonNull double discount) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", quantity="
				+ quantity + ", discount=" + discount + "]";
	}
	
	

	
	

	

}
