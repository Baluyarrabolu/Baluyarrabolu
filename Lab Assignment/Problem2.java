package com.balu;

public class Problem2 {
	
	public static void main(String[] args) {
		Country countries=new Country();
		countries.storeCountryNames("China");
		countries.storeCountryNames("Japan");
		countries.storeCountryNames("India");
		countries.storeCountryNames("Pakistan");
		countries.storeCountryNames("Korea");
		
		System.out.println("China: "+countries.getCountry("China"));
		System.out.println("India: "+countries.getCountry("India"));
		
	}
}
