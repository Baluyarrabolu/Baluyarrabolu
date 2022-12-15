package com.jojuskills;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map <Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(532, null);
		map.put(234,"siva");
		map.put(142,"srinadh");
		map.put(345, null);
		map.put(145,"nyam");
		
		//System.out.println(map);
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
