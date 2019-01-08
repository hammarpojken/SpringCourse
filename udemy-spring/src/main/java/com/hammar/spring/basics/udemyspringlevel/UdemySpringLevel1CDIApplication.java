package com.hammar.spring.basics.udemyspringlevel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hammar.spring.basics.udemyspringlevel.cdi.SomeCdiBusiness;

@SpringBootApplication
public class UdemySpringLevel1CDIApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(UdemySpringLevel1CDIApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext run = SpringApplication.run(UdemySpringLevel1CDIApplication.class, args);
		
		SomeCdiBusiness someCdiBusiness = run.getBean(SomeCdiBusiness.class);
		
		
		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());
	
		
	}

}

