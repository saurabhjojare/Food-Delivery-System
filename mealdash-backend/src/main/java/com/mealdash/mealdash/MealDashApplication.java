package com.mealdash.mealdash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MealDashApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealDashApplication.class, args);
	}

}
