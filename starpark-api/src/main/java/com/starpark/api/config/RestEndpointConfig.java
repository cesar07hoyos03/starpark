package com.starpark.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Class with properties of all end points of external APIs.
 * 
 * @since 0.0.1
 * @version 0.0.1
 *
 */
@ConfigurationProperties("rest.context-path")
@Data
@Component
public class RestEndpointConfig {

}
