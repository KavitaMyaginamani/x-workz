package com.xworkz.fooddelivery;

public class CustomerEntity {

	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String location;
	private int rating;
	private float phoneNo;
	private String email;
	private String gender;

	
public CustomerEntity(String name, String location, int rating, float phoneNo, String email, String gender) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender = gender;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", gender=" + gender + "]";
	}

}


