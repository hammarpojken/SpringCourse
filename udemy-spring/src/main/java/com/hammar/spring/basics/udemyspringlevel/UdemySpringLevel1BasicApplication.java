package com.hammar.spring.basics.udemyspringlevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hammar.spring.basics.udemyspringlevel.basics.BinarySearchImpl;


@SpringBootApplication
public class UdemySpringLevel1BasicApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext run = SpringApplication.run(UdemySpringLevel1BasicApplication.class, args);
		
		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,4,6}, 2);
		
		System.out.println(result);
	}

}

