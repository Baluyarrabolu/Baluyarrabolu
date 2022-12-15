//LinkedList Example

package com.balu;
import java.util.*;
import java.util.stream.Collectors;

public class LinkedListExample {

	public static void main(String[] args) {
	List<Integer> marks=new LinkedList<Integer>();
	marks.add(28);
	marks.add(35);
	marks.add(87);
	marks.add(38);
	marks.add(46);
	
	System.out.println("New List of marks:"+marks);

	List<Integer> n=marks.stream().sorted((l1,l2)->l1.compareTo(l2)).collect(Collectors.toList());
	System.out.println("Sorting:"+n);

	long m=marks.stream().count();
	System.out.println("No.of subjects:"+m); // count() method to count
	
	List<Integer> update=marks.stream().map(m->m*5).collect(Collectors.toList());
	//update.forEach(System.out::println);
	System.out.println("After Adding marks:"+update); 

	}
}
