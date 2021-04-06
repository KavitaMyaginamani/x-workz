package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.FoodItem;
import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;

public class FoodServiceTester {

	public static void main(String[] args) {
		FoodItem entity=new FoodItem("vegBiriyani", 120.0, FoodType.SOUTHINDIAN, 23, 25.0);
		FoodItemRepository repo=new FoodItemRepositoryImpl();
		FoodItemService service=new FoodItemServiceImpl(repo);
		service.validateAndSave(entity);

	}

}
