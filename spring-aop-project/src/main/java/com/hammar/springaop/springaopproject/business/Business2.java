package com.hammar.springaop.springaopproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hammar.springaop.springaopproject.data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateData() {
		//business logic
		return dao2.retrieveData();
	}

}
