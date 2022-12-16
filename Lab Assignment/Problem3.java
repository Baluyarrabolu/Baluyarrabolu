package com.balu;

import java.util.HashMap;

public class Problem3 {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.storeCountryCapital("India", "Delhi");
	  	countryMap.storeCountryCapital("Japan", "Tokyo");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKeyValue();
		System.out.println(M2);
	}
}
