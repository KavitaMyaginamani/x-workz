package com.xworkz.fooddelivery.tester;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.CustomerEntity;
import com.xworkz.fooddelivery.FoodItem;
import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;
import com.xworkz.fooddelivery.service.FoodItemService;

public class CustomerServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("customer.xml",
				"application-db.xml");
		CustomerService service = container.getBean(CustomerService.class);
		
		SessionFactory sf = container.getBean(SessionFactory.class);
		System.out.println(sf);
		CustomerEntity entity = new CustomerEntity("Bindu", "Rajajinagar Bangalore", 4, 8197028626f,
				"bindu1998@gmail.com", "female");
	    service.validateAndsave( entity);

	}

}
