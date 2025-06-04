package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//Dependency injection 
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Alien A1 = context.getBean(Alien.class);
		System.out.println("hello boot...");
		A1.show();
		
		
		/*
		 * Alien A2 = context.getBean(Alien.class); System.out.println("hello boot...");
		 * A2.show();
		 */
		
	}
	

}
