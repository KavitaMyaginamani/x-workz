package com.xworkz.fooddelivery.repository;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.FoodItem;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	private SessionFactory factory;
	

	public FoodItemRepositoryImpl(SessionFactory factory) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(FoodItem entity) {
		System.out.println("invoke FoodItemRepository "+entity);
		System.out.println("save in DB by using jpa");
		
		Session session=factory.openSession();
		session.save(entity);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	
		
		
	}

}
