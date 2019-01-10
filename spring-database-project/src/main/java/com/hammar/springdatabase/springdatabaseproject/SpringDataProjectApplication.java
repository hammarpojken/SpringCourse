package com.hammar.springdatabase.springdatabaseproject;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hammar.springdatabase.springdatabaseproject.entity.Person;
import com.hammar.springdatabase.springdatabaseproject.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataProjectApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(" User with id 10003 {}", repo.findById(10003));
		logger.info(" Inserting new person {}", repo.save(new Person("Martin", "Trosa", new Date())));
		logger.info(" Updated person {}", repo.save(new Person(10001,"Robin", "Malmö", new Date())));
		
		logger.info(" Persons in the h2 DB {}", repo.findAll());
		/*		
		logger.info(" Users with name niclas {}", dao.findByName("Niclas"));
		logger.info(" Deleted rows {}", dao.deleteById(10005));
	*/	
	}

}

