package com.jojuskills;
import java.util.Map;
import java.util.TreeMap;

class Book{
		int id;
		String name,author,publisher;
		int quantity;
		
		public Book(int id, String name, String author, String publisher, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
		}
	}
public class MapBookExample {
	public static void main(String[] args) {
		Map<Integer,Book> map=new TreeMap<Integer,Book>();
		
		//Creating Books
		Book b1=new Book(104,"Python","George","Balu",4);
		Book b2=new Book(95,"Java","Harry","Raju",8);
		Book b3=new Book(110,"Spring","Einstein","Sai",5);

		//Adding Books to map
		map.put(5,b3);
		map.put(2,b2);
		map.put(8,b1);
		
		//Traversing map
		for(Map.Entry<Integer,Book> m:map.entrySet()) {
			int key=m.getKey();
			Book b=m.getValue();
			System.out.print("Key "+key+" Details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
