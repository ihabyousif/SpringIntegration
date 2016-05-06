package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@EnableIntegration
@SpringBootApplication
@ImportResource("classpath*:/spring/si-config.xml")
public class TestSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringIntegrationApplication.class, args);
	}
}
