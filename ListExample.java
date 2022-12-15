//ArrayList Example

package com.balu;

import java.util.List;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Hi");
	list.add("Balu");
	list.add("Hello");
	
	list.forEach(n->System.out.println(n)); //Lambda Expression
	list.forEach(System.out::println); //forEach() method
	list.stream().forEachOrdered(n->System.out.println(n)); //forEachOrdered() method
	
	}
}
