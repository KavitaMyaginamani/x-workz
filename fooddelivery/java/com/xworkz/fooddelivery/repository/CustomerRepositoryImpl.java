package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoke customerRepository "+entity );
		System.out.println("save in  DB by using jpa");
		
	}

}
