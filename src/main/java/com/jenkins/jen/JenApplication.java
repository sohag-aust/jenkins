package com.jenkins.jen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenApplication {

	public static Logger logger = LoggerFactory.getLogger(JenApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application has started !!");
	}

	public static void main(String[] args) {
		logger.info("Application has executed !!");
		SpringApplication.run(JenApplication.class, args);
	}

}
