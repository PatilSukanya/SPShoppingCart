package com.springboot.SPShoppingCart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SPShoppingCart.entity.Brand;

@Repository
public interface IBrandRepo extends JpaRepository<Brand, Integer> {

	public List<Brand> findByProductId(int productId);
	public List<Brand> findByBrand(String name);
}
