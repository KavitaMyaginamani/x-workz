package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.HotelVendorType;

public class HotelVendorEntity {

	public HotelVendorEntity() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String location;
	private int rating;
	private float phoneNo;
	private HotelVendorType hotelvendortype;

	
	public HotelVendorEntity(String name, String location, int rating, float phoneNo, HotelVendorType hotelvendortype) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.hotelvendortype = hotelvendortype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public float getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(float phoneNo) {
		this.phoneNo = phoneNo;
	}

	public HotelVendorType getHotelvendortype() {
		return hotelvendortype;
	}

	public void setHotelvendortype(HotelVendorType hotelvendortype) {
		this.hotelvendortype = hotelvendortype;
	}
	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo="
				+ phoneNo + ", hotelvendortype=" + hotelvendortype + "]";
	}



}
