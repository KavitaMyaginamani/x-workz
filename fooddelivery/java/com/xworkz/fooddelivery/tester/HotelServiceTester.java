package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.HotelVendorEntity;
import com.xworkz.fooddelivery.constant.HotelVendorType;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class HotelServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("vendor.xml");
		HotelVendorService service=container.getBean(HotelVendorService.class);
		HotelVendorEntity entity = new HotelVendorEntity("Sudha", "Gadag", 7, 7890675221f, HotelVendorType.WHOLESALERS);
		//HotelVendorRepository hotelVendorRepository = new HotelVendorRepositoryImpl();
		//HotelVendorService hotelVendorService = new HotelVendorServiceImpl(hotelVendorRepository);
		service.validateAndsave(entity);
	}

	

}
