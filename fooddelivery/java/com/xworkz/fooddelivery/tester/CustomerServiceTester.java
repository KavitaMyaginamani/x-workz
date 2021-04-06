package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;

public class CustomerServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerEntity entity = new CustomerEntity("Bindu", "Rajajinagar Bangalore", 4, 8197028626f,
				"bindu1998@gmail.com", "female");
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		CustomerService customer = new CustomerServiceImpl(customerRepository);
		customer.validateAndsave(entity);

	}

}
