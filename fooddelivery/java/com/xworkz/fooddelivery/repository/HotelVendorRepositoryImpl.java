package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository  {
	private SessionFactory factory;

	public HotelVendorRepositoryImpl(SessionFactory factory) {
		System.out.println("cerated "+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoke HotelVendorRepositoryImpl "+entity);
		System.out.println("save data by using JPA");
		
		Session session=factory.openSession();
		session.save(entity);
		session.beginTransaction().commit();
		session.close();
		factory.close();
	
		
		
	}

}
