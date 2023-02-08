package com.springboot.SPShoppingCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.SPShoppingCart.entity.Customer;
import com.springboot.SPShoppingCart.repository.ICustomerRepo;

@Service
public class CustomerService {

	@Autowired
	ICustomerRepo custRepository;
	
	public ResponseEntity<Customer> save(Customer customer) {
		try {
		return new ResponseEntity<>(custRepository.save(customer), HttpStatus.CREATED);
		} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
}
