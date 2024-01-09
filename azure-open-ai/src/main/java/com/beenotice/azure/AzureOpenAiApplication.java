package com.beenotice.azure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class AzureOpenAiApplication {
	public static void main(String[] args) {
		SpringApplication.run(AzureOpenAiApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(SimpleAiService simpleAiService ) {
		return args -> {
			simpleAiService.run();
		};
	}
}
