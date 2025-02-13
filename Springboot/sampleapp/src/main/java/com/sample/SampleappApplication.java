package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sample")
public class SampleappApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
		
	}

}
