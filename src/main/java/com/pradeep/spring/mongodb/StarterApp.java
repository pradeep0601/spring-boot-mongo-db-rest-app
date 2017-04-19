package com.pradeep.spring.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Pradeep
 *
 */
@SpringBootApplication
public class StarterApp {

	private static final Logger log = LoggerFactory.getLogger(StarterApp.class);

	public static void main(String[] args) {
		SpringApplication.run(StarterApp.class, args);
		
		log.info("Application got started...");

	}
}
