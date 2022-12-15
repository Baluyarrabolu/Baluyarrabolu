package com.balu;

import java.util.*;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Hi");
		ts.add("Hello");
		ts.add("Welcome");
		ts.add("Anu");
//ts.forEach(System.out::println);
System.out.println(ts);
List<String> DesortedList=ts.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
System.out.println(DesortedList);
Iterator<String> i=ts.descendingIterator();
while(i.hasNext()) {
System.out.println(i.next());}
	}
}