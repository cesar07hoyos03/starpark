/**
 * Copyright 2017, Starpark
 * http://www.starpark.com
 * All rights reserved
 * @since 2017-10-20
 */
package com.starpark.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableWebMvc
@Slf4j
public class CorsConfig extends WebMvcConfigurerAdapter {

	@Value("${cors.allowed.origins}")
	private String allowedOrigins;

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		log.info("Allowing CORS from URLS: [{}]", this.allowedOrigins);
		registry.addMapping("/**").allowedOrigins(this.allowedOrigins).allowedMethods(HttpMethod.OPTIONS.name(),
				HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.PUT.name()).allowedHeaders("*")
				.allowCredentials(false).maxAge(600);
	}
}