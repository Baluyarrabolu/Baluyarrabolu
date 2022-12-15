package com.balu;
import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(25);
		hs.add(16);
		hs.add(56);
		hs.add(99);
		hs.add(70);
		System.out.println(hs);

		List<Integer> m=hs.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("After Sorting:"+m);
		List<Integer> n=hs.stream().filter(i->i%2==1).collect(Collectors.toList()); //Filter()
		System.out.println("Filtering Odd nos:"+n);
		List<Integer> h=hs.stream().map(i->i+5).collect(Collectors.toList()); //Mapping()
		System.out.println("Mapping add 5:"+h);
		long p=hs.stream().count();
		System.out.println("Count:"+p);
		int a=hs.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Max value:"+a);
		int b=hs.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Min value:"+b);
	}
}