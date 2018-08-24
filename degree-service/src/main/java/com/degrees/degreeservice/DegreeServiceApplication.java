package com.degrees.degreeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DegreeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DegreeServiceApplication.class, args);
	}
}
