package com.example.sportyshoeswebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class SportyshoeswebappApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SportyshoeswebappApplication.class, args);
		
	}
	
}
