package com.degrees.degree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DegreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DegreeApplication.class, args);
	}
}
