package com.hammar.spring.basics.udemyspringlevel1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemySpringLevel1Application {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {1,4,6}, 2);
		System.out.println(result);
		
		SpringApplication.run(UdemySpringLevel1Application.class, args);
	}

}

