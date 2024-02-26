package com.example.jenkinsapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsAppApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsAppApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started");
	}

	public static void main(String[] args) {

		logger.info("Application executed");
		SpringApplication.run(JenkinsAppApplication.class, args);
	}

}
