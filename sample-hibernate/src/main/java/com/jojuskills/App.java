package com.jojuskills;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.jojuskills.entity.Student;
import com.jojuskills.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Session session=HibernateUtil.makeSession();
    	
    	Student s=new Student();
    	
    	s.setSno(1);
    	s.setSname("Balu");
    	s.setCourse("Java");
    	
    	Transaction tr=session.beginTransaction();
    	//save the object
    	session.save(s);
    	tr.commit();
    	// close the session
    	session.close();
    	
        System.out.println( "Hibernate World!" );
    }
}
