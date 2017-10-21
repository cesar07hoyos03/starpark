/**
 * Copyright 2017, Starpark
 * http://www.starpark.com
 * All rights reserved
 * @since 2017-10-20
 */
package com.starpark.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starpark.api.constant.ResourceEndpoint;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller to receive request related with customer.
 * 
 * @since 0.0.1
 * @version 0.0.1
 * @author <a href="cesar07hoyos03@gmail.com">C&eacute;sar Hoyos</a>
 *
 */
@Controller
@RequestMapping(value = ResourceEndpoint.HEALTH_RESOURCE)
@Slf4j
public class HealthController {

	@GetMapping()
	ResponseEntity<Void> getHealthStatus() {

		log.info("Received request for health status");
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
