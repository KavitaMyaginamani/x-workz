package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;

public class CustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerEntity entity = new CustomerEntity("Bindu", "Rajajinagar Bangalore", 4, 8197028626f,
				"bindu1998@gmail.com", "female");
		CustomerRepository customerRepository = new CustomerRepositoryImpl(null);
		customerRepository.save(entity);

	}

}
