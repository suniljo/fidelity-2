package com.fidelity.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//initializing spring container
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("-".repeat(80));
		
		int noOfBeansConfigured = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeansConfigured);
		System.out.println("-".repeat(80));
		
		String[] beanNames = context.getBeanDefinitionNames();
		for(int i=0; i<beanNames.length; i++) {
			System.out.printf("%d - %s\n", (i+1), beanNames[i]);
		}
	}
}
