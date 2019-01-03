package com.hammar.spring.basics.udemyspringlevel1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UdemySpringLevel1Application {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext run = SpringApplication.run(UdemySpringLevel1Application.class, args);
		
		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,4,6}, 2);
		
		System.out.println(result);
	}

}

