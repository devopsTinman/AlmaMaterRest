package com.allbeelean.almamater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.allbeelean.almamater"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class AlmaMaterRestApiApp {

	public static void main(String[] args) {
		SpringApplication.run(AlmaMaterRestApiApp.class, args);
	}
}