package com.hammar.spring.basics.udemyspringlevel.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {
	
	
	public int[] getData() {
		
		return new int [] {6,38,97};
	}

}
