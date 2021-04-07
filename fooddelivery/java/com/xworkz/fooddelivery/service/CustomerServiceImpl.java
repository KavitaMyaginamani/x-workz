package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepo;

	public CustomerServiceImpl(CustomerRepository customerRepo) {
          System.out.println("created "+this.getClass().getSimpleName());
          this.customerRepo=customerRepo;
	}

	@Override
	public boolean validateAndsave(CustomerEntity entity) {
        System.out.println("invoke validate and save "+entity);
        if(entity!=null) {
        	System.out.println("enitity is valid");
        	customerRepo.save(entity);
        	
        }else {
        	System.out.println("entity is not valid");
        }
		return false;
	}

}
