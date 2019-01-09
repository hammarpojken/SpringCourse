package com.hammar.springaop.springaopproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hammar.springaop.springaopproject.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	public String calculateData() {
		//business logic
		return dao1.retrieveData();
	}

}
