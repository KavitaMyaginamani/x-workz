package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	private SessionFactory factory;

	public CustomerRepositoryImpl( SessionFactory factory) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoke customerRepository "+entity );
		System.out.println("save in  DB by using jpa");
		
		Session session=factory.openSession();
		session.save(entity);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	
		
		
	}

}
