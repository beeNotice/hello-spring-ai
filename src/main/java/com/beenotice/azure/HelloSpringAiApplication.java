package com.beenotice.azure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloSpringAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringAiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(SimpleAiService simpleAiService ) {
		return args -> {
			simpleAiService.run();
		};
	}
}
