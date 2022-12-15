package com.balu;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.List;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<>();
		hs.add(25);
		hs.add(48);
		hs.add(18);
		hs.add(92);
		hs.add(78);
		System.out.println(hs);
		List<Integer> n=hs.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());	
		System.out.println("After Sorting:"+n);

		List<Integer> m=hs.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Filtering:"+m);
		List<Integer> q=hs.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("Mapping:"+q);
		long p=hs.stream().count();
		System.out.println("Count:"+p);
		System.out.println("Min value:"+hs.pollFirst());
		System.out.println("Max value:"+hs.pollLast());

		int s=hs.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("First:"+s);
		int r=hs.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Last:"+r);
	}
}