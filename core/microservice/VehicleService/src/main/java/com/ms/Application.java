package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author cshah1
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
