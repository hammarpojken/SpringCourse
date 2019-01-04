package com.hammar.spring.basics.udemyspringlevel1.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgo;
	
	public BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}

	public int binarySearch(int [] numbers, int number) {
		int [] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		return 0;
		
	}
}
