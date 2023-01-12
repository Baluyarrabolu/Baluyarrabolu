package com.balu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSentProjectApplication.class, args);
		
		System.out.print("Mail Project Succeeded...");
	}

}
