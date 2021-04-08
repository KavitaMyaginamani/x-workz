package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository  {

	public HotelVendorRepositoryImpl() {
		System.out.println("cerated "+this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoke HotelVendorRepositoryImpl "+entity);
		System.out.println("save data by using JPA");
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
