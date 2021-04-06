package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.FoodItem;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItem entity) {
		System.out.println("invoke FoodItemRepository "+entity);
		System.out.println("save in DB by using jpa");
		
	}

}
