package com.springboot.SPShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SPShoppingCart.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
