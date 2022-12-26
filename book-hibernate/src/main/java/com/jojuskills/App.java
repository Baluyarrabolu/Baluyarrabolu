package com.jojuskills;

import java.util.ArrayList;

import org.hibernate.Session;

import com.jojuskills.entity.Book;
import com.jojuskills.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Session ss=HibernateUtil.getSessionFactory().openSession();
    	ss.beginTransaction();
    	
    	ArrayList<Book> l=new ArrayList<>();
    	Book b1=new Book("Adv_java","sai");
    	Book b2=new Book("Core_java","Mahesh");
    	Book b3=new Book("Hibernate","Balu");
    	Book b4=new Book("Spring","krishna");
    	
    	l.add(b1);	l.add(b2);	l.add(b3);	l.add(b4);
    	//save the objects
    	l.forEach(n->ss.save(n));
    	
    	// do changes
    	b3.setAuthor("Ram");
    	
    	//Update the Book Object
    	ss.saveOrUpdate(b3);
    	
    	//Delete the Book Object
    	ss.delete(b2);
    	
    	// get Book entity using get() method
    	System.out.println("using get() method");
    	Book book=ss.get(Book.class,1);
    	System.out.println("Book Name: "+book.getBookname());
    	System.out.println("Book Author: "+book.getAuthor());
    	
    	// get Book entity using load() method
    	System.out.println("using load() method");
    	Book book1 = ss.load(Book.class, 1);
    	System.out.println("Book Name: "+book1.getBookname());
    	System.out.println("Book Author: "+book1.getAuthor());
    	
    	// Obtain an entity using byId() method
    	System.out.println("By using Id() method");
    	Book book2=ss.load(Book.class, 3);
    	System.out.println("Book Name: "+book2.getBookname());
    	System.out.println("Book Author: "+book2.getAuthor());
    	
    	ss.getTransaction().commit();
    	System.out.println("Txn completed");
    }
}
