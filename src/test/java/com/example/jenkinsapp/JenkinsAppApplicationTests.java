package com.example.jenkinsapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsAppApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsAppApplication.class);

	@Test
	void contextLoads() {

		logger.info("Test executing...");
		assertEquals(true, true);

	}

}
