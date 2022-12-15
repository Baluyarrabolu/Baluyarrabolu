package com.balu;
import java.util.HashSet;

public class BookHashSet {

	public static void main(String[] args) {
		HashSet<BookExample> b=new HashSet<BookExample>();
		BookExample b1=new BookExample(12,"Java","Raju",1500);
		BookExample b2=new BookExample(27,"C","Sai",2600);
		BookExample b3=new BookExample(38,"Python","Shiva",3800);

		b.add(b1);
		b.add(b2);
		b.add(b3);
		System.out.println(b);

	}
}