package com.jojuskills;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(32,"Hello");
		map.put(54, null);
		map.put(76,"Sai");
		map.put(80,"siva");
		System.out.println(map);
		/*for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());}*/
		map.remove(54);
		System.out.println("removing a key:"+map);
		//Maintains descending order
		System.out.println("descendingMap: "+map.descendingMap());
		//Returns key-value pairs whose keys are less than or equal to the specified key.
		System.out.println("headMap: "+map.headMap(80,false));
		//Returns key-value pairs whose keys are greater than or equal to the specified key.
		System.out.println("tailMap: "+map.tailMap(50,true));
		//Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: "+map.subMap(50, false, 85, false));
	}
}
