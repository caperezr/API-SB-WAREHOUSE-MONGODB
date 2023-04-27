package com.cperez.apimongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories()
public class ApimongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApimongodbApplication.class, args);
	}

}
