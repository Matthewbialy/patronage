package com.crud.intive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IntiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntiveApplication.class, args);
	}

}
