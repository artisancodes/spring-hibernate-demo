package io.artisancodes.springhibernatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication enables the following annotations:
// @EnableAutoConfiguration: Enables Spring Boot's auto-configuration support.
// @ComponentScan: Enables component scanning of current package also recursively scans sub-packages.
// @Configuration: Able to register extra beans with @Bean or import other configuration classes.
@SpringBootApplication(
		// Explicitly list base packages to scan
		scanBasePackages = {
				"io.artisancodes.springhibernatedemo",
				"io.artisancodes.util" }
)
public class SpringHibernateDemoApplication {

	public static void main(String[] args) {
		// SpringApplication bootstrap you Spring Boot application.
		// Behind the scenes this will create the application context and registers all beans
		// also starts the embedded server Tomcat.
		SpringApplication.run(SpringHibernateDemoApplication.class, args);
	}

}
