package com.example.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootMain {
	
	public static void main(String arg[]) 
	{
		SpringApplication.run(SpringBootMain.class, arg);
	}

}
