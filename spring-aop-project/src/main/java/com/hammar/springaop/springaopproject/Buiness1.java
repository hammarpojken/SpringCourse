package com.hammar.springaop.springaopproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Buiness1 {
	
	@Autowired
	private Dao1 dao1;
	
	public String calculateData() {
		//business logic
		return dao1.retrieveData();
	}

}
