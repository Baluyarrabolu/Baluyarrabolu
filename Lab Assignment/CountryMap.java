package com.balu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMap {
	private HashMap<String,String> M1=new HashMap<>();
		
	public HashMap<String,String> storeCountryCapital(String CountryName, String Capital){
		M1.put(CountryName, Capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Map.Entry<String,String>> set= M1.entrySet();
		Iterator<Map.Entry<String,String>> it=set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String,String> me=it.next();
			
			if(me.getValue().equals(capitalName)) {
				return me.getKey();
			}
		}
		return null;
	}
		
	public HashMap<String,String> swapKeyValue(){
		HashMap<String,String> M2=new HashMap<>();
			
		Set<Map.Entry<String,String>> set = M1.entrySet();
		Iterator<Map.Entry<String,String>> it = set.iterator();
			
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			M2.put(me.getValue(),me.getKey());
		}	
		return M2;

	}
	
	public ArrayList<String> toArrayList(){
		ArrayList<String> list = new ArrayList<>();
		
		Set<Map.Entry<String, String>> set = M1.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		return list;
	}
	
	}



