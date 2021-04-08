package com.xworkz.fooddelivery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooddelivery.constant.HotelVendorType;

import lombok.Data;
@Data
@Entity
@Table(name="hotel_vendor")
public class HotelVendorEntity {
	
	@Id
	@Column(name="H_ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="RATING")
	private int rating;
	@Column(name="PHONE_NO")
	private float phoneNo;
	@Column(name="HOTELVENDORTYPE")
	private HotelVendorType hotelvendortype;
	
	public HotelVendorEntity() {
		
	}
	

	
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
