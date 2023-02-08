package com.springboot.SPShoppingCart.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SPShoppingCart.entity.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
	
	public List<Product> findByName(String name);
		

}
