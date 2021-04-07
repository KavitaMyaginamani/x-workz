package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {
	private HotelVendorRepository hotelRepo;

	public HotelVendorServiceImpl(HotelVendorRepository hoteRepo) {
		System.out.println("cerated "+this.getClass().getSimpleName());
		this.hotelRepo=hoteRepo;
	}

	@Override
	public boolean validateAndsave(HotelVendorEntity entity) {
		System.out.println("invoke validate and save "+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			hotelRepo.save(entity);
		}else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
