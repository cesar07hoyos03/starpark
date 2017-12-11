package com.starpark.api.domain;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {

	@Id
	public String id;
	public String firstName;
	public String lastName;

	public Customer() {
	}

}