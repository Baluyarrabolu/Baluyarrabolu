package com.jojuskills;
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(124,"balu");
		map.put(112,"sai");
		map.put(136,"ravi");
		map.put(53,"amit");
		
		//System.out.println(map);
		/*for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}
}
