package com.userservice.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	/**
	 * RestTemplate to Call/Consume another Rest API Service
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
