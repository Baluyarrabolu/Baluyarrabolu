package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

//Map with List...
public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer,List<String>> map=new TreeMap<>();
		List <String> al=new ArrayList<>();
		al.add("hello");
		al.add("balu");
		al.add("doing");
		al.add("you");
		//sorting elements
		List<String> l1=al.stream().sorted().collect(Collectors.toList());
		List<String> l2=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		
		//adding elements to the tree map
		map.put(98, al); //Insertion Order
		map.put(95,l1); //Sorted ArrayList
		map.put(110,l2); //Descending ArrayList
		
		//System.out.println(map);
		for(Entry<Integer, List<String>> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
