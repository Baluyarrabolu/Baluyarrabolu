package com.jojuskills;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import com.jojuskills.entity.Category;
import com.jojuskills.entity.Stock;
import com.jojuskills.util.HibernateUtil;

public class App {
	
    @SuppressWarnings("deprecation")
	public static void main( String[] args ){
    	
    	Session ss=HibernateUtil.getSessionFactory().openSession();
    	ss.beginTransaction();
    	
    	Stock s1=new Stock();
    	s1.setStockCode("aa2");
    	s1.setStockName("nifty");
    	
    	Category c=new Category("aaa","bbb", null);
    	Category c1=new Category("ccc", "ddd", null);
    	
    	Set<Category> categories =new HashSet<Category>();
    	categories.add(c);
    	categories.add(c1);
    	
    	s1.setCategories(categories);
    	ss.save(s1);
    	ss.getTransaction().commit();   
    	
        System.out.println( "Completed..." );
    }
}
