package com.hammar.spring.basics.udemyspringlevel.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Defines a bean
@Component
public class BinarySearchImpl {
	
	Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	// Automatically creates the dependency
	@Autowired
	private SortAlgorithm sortAlgo;
	

	public int binarySearch(int [] numbers, int number) {
		int [] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		return sortedNumbers[0];
		
	}
	// Called after the bean has been created
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct");
	}
	// Called before the bean is destroyed
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy");
	}
}
