package com.hammar.springdatabase.springdatabaseproject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hammar.springdatabase.springdatabaseproject.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class SpringDatabaseProjectApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" Persons in the h2 DB {}", dao.findAll());
		
	}

}

