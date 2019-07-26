package com.codespeaks.rest.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class CustomerserviceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CustomerserviceApplication.class, args);
	}
	
	/*
	 @Bean
	 public CommandLineRunner DBInit() {
		return new DBInit();
	 }
	*/ 
	   
}
