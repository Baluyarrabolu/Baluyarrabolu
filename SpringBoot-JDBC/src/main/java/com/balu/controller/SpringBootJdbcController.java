package com.balu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {

	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email)values('balu','balu123@gmail.com')");
		return "data inserted successfully";
	}
}
