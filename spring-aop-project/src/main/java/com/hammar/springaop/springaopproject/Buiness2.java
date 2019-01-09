package com.hammar.springaop.springaopproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Buiness2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateData() {
		//business logic
		return dao2.retrieveData();
	}

}
