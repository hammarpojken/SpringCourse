package com.hammar.springdatabase.springdatabaseproject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hammar.springdatabase.springdatabaseproject.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaProjectApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" User with id 10003 {}", repo.findById(10003));
		
		/*		
		logger.info(" Persons in the h2 DB {}", dao.findAll());
		logger.info(" Users with name niclas {}", dao.findByName("Niclas"));
		logger.info(" Deleted rows {}", dao.deleteById(10005));
		logger.info(" Inserting new person {}", dao.insert(new Person(10006, "Martin", "Trosa", new Date())));
		logger.info(" Updated person {}", dao.update(new Person(10006,"Karl", "Trosa", new Date())));
	*/	
	}

}

