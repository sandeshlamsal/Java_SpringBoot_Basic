package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Country;

@RestController
public class HomeController {
	    @Autowired 
		UserController uc;
	    
	    @Autowired
	    Country c;
			
	@RequestMapping( value="/hello")
	public String index(){
	   // @Value("${user.name}")
		return uc.sayHai();
	}
	
	@RequestMapping( value="/country")
	public String index1(){
	   // @Value("${user.name}")
		return c.getCountry();
	}
	
	public int sum(int a, int b){
		return a+b;
	}
	
	}
