package com.model;

import org.springframework.stereotype.Component;

@Component
public class Country { 
	String name="Nepal";
	public String getCountry(){
		return name;
	}
	
}
