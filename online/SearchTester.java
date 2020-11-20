package com.xworkz.online;

public class SearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm kareyuvudu main");

		System.out.println("Total items to search" + Amazon.totalItems());
		Amazon.search("Glass");

		System.out.println("main nirgamana");
	}

}
