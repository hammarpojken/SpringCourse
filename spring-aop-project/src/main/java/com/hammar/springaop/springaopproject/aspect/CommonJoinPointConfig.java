package com.hammar.springaop.springaopproject.aspect;

import org.aspectj.lang.annotation.Pointcut;


//Best practice to have a file for all pointcuts
public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.hammar.springaop.springaopproject.data.*.*(..))")
	public void dataLayerExecution() {
		
	}
	@Pointcut("execution(* com.hammar.springaop.springaopproject.business.*.*(..))")
	public void businessLayerExecution() {
		
	}

}
