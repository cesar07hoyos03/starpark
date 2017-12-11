package com.starpark.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starpark.api.domain.Customer;
import com.starpark.api.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public List<Customer> getCustomers() {
		return this.repository.findAll();
	}

	public void addCustomer(Customer customer) {
		this.repository.save(customer);
	}
}
