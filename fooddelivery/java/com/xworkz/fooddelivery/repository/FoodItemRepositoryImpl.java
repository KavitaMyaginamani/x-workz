package com.xworkz.fooddelivery.repository;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.FoodItem;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItem entity) {
		System.out.println("invoke FoodItemRepository "+entity);
		System.out.println("save in DB by using jpa");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.save(entity);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	
		
		
	}

}
