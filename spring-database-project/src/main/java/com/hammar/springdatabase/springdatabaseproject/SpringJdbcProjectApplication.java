package com.hammar.springdatabase.springdatabaseproject;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.hammar.springdatabase.springdatabaseproject.entity.Person;
import com.hammar.springdatabase.springdatabaseproject.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcProjectApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" Persons in the h2 DB {}", dao.findAll());
		logger.info(" User with id 10003 {}", dao.findById(10003));
		logger.info(" Users with name niclas {}", dao.findByName("Niclas"));
		logger.info(" Deleted rows {}", dao.deleteById(10005));
		logger.info(" Inserting new person {}", dao.insert(new Person(10006, "Martin", "Trosa", new Date())));
		logger.info(" Updated person {}", dao.update(new Person(10006,"Karl", "Trosa", new Date())));
		
	}

}

