package com.hammar.spring.basics.udemyspringlevel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hammar.spring.basics.udemyspringlevel.scope.PersonDao;

@SpringBootApplication
public class UdemySpringLevel1ScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(UdemySpringLevel1ScopeApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext run = SpringApplication.run(UdemySpringLevel1ScopeApplication.class, args);
		
		PersonDao personDao = run.getBean(PersonDao.class);
		PersonDao personDao2 = run.getBean(PersonDao.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbc());
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbc());
		
	}

}

