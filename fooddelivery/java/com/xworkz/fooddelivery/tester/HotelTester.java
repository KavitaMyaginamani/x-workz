package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.HotelVendorEntity;
import com.xworkz.fooddelivery.constant.HotelVendorType;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;

public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelVendorEntity entity = new HotelVendorEntity("Sudha", "Gadag", 7, 7890675221f, HotelVendorType.WHOLESALERS);
		HotelVendorRepository hotelVendorRepository = new HotelVendorRepositoryImpl(null);
		hotelVendorRepository.save(entity);

	}

}
