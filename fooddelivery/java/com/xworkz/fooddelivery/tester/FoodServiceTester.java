package com.xworkz.fooddelivery.tester;



import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.FoodItem;
import com.xworkz.fooddelivery.constant.FoodType;

import com.xworkz.fooddelivery.service.FoodItemService;

public class FoodServiceTester {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml",
				"application-db.xml");
		FoodItemService service = container.getBean(FoodItemService.class);
		
		SessionFactory sf = container.getBean(SessionFactory.class);
		System.out.println(sf);
		FoodItem entity2 = new FoodItem("masal dosa", 60, FoodType.NORTHINDIAN, 3, 20.0);
	    service.validateAndSave(entity2);
	    
	}
}
