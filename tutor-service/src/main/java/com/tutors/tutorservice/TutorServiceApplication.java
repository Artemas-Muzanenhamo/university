package com.tutors.tutorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TutorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorServiceApplication.class, args);
	}
}
