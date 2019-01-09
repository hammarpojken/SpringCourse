package com.hammar.springaop.springaopproject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value="execution(* com.hammar.springaop.springaopproject.business.*.*(..))",
			returning="result"
			)
	public void afterReturning(JoinPoint joinPoint, Object result) {
		
		logger.info("{} returned with value {}", joinPoint, result);
	}
}
