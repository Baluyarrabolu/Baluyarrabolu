package com.jojuskills;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jojuskills.service.UserService;
import com.jojuskills.service.UserServiceImpl;

public class App {
	
    public static void main( String[] args ){
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = context.getBean("userServiceImpl",UserServiceImpl.class);
		userService.save();
		// Close the context
		context.close();
	
        System.out.println( "Hello Hibernate World!" );
    }
}
