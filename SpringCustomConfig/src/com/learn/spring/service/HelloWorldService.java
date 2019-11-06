package com.learn.spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	
	/**
	 * 
	 * @return
	 */
	public String getFirstWelcomeMessage()
	
	{
		
		return "welcome to the spring custom config tutorial";
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSecondWelcomeMessage()
	
	{
		
		return "welcome every one again to the spring mvc custom config tutorial";
	}
	
	

}
