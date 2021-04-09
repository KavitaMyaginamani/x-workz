package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.FoodItem;
import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;

public class FoodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItem item=new FoodItem("vegBiriyani", 120.0, FoodType.SOUTHINDIAN, 23, 25.0);
		FoodItemRepository repo=new FoodItemRepositoryImpl(null);
		repo.save(item);
		

	}

}
