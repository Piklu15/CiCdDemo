package com.bjitacademy.cicd.CicdDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CicdDemoApplication {

	public static final Logger logger = LoggerFactory.getLogger(CicdDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialSetup() {
		return args -> {
			logger.info("Initial setup is done");
		};
	}

}
