package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.FoodItem;
import com.xworkz.fooddelivery.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {
	private FoodItemRepository repo;

	public FoodItemServiceImpl(FoodItemRepository repo) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(FoodItem entity) {
		System.out.println("invoke validateAndSave "+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			repo.save(entity);
		}else {
			System.out.println("entity is not valid");
		}
		return false;
	}
	

}
