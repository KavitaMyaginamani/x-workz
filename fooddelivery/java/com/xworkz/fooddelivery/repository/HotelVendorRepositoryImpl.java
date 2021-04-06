package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository  {

	public HotelVendorRepositoryImpl() {
		System.out.println("cerated "+this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoke HotelVendorRepositoryImpl "+entity);
		System.out.println("save data by using JPA");
		
	}

}
