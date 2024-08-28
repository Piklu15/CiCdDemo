package com.bjitacademy.cicd.CicdDemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CicdDemoApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(CicdDemoApplication.class);


	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
		logger.info("Welcome to CICD test");
        assertTrue(true);
	}
}
