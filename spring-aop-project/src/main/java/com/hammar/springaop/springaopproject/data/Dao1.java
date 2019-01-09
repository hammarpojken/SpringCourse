package com.hammar.springaop.springaopproject.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String retrieveData() {
		return "Dao1";
	}

}
