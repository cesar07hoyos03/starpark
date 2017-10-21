/**
 * Copyright 2017, Starpark
 * http://www.starpark.com
 * All rights reserved
 * @since 2017-10-20
 */
package com.starpark.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestOperations;

@SpringBootApplication
@ComponentScan({ "com.starpark.api" })
@EnableCaching
public class StarparkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarparkApiApplication.class, args);
	}

	@Bean
	public RestOperations getRestTemplate(RestTemplateBuilder builder) {

		return builder.build();
	}
}
