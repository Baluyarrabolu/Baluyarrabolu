package com.balu;

public class BookExample {
	
	private int bookid;
	private String bookname;
	private String author;
	private long price;

	public BookExample(int bookid, String bookname, String author, long price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ "]";
		
	}
	
}