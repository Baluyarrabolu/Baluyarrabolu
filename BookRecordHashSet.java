package com.balu;
import java.util.HashSet;

public class BookRecordHashSet {

	public static void main(String[] args) {
		HashSet<BookRecord> br=new HashSet<BookRecord>();
		BookRecord br1=new BookRecord(1652,"Collections","Raju",1200);
		BookRecord br2=new BookRecord(1762,"Set","Balu",300);
		BookRecord br3=new BookRecord(2048,"List","Sai",250);
		
		br.add(br1);	br.add(br2);	br.add(br3);
			
		System.out.println(br);
	}
}