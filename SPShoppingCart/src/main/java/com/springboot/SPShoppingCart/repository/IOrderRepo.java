package com.springboot.SPShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SPShoppingCart.entity.Orders;

public interface IOrderRepo extends JpaRepository<Orders, Integer> {

}
