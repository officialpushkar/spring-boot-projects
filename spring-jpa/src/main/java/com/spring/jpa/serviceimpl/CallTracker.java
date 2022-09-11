package com.spring.jpa.serviceimpl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CallTracker {

	
	@Pointcut("within(com..controller.*) || within(com..repository.*)")
	public void logMethodPointCut() {
		
	}
	
	@Before("logMethodPointCut()")
	public void logBeforeMethodCall() {
		
		System.out.println("Call Before Method execution");
		
	}
	
}
