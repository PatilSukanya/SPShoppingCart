package com.springboot.SPShoppingCart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.SPShoppingCart.entity.Brand;
import com.springboot.SPShoppingCart.repository.IBrandRepo;
 
@Component
public class BrandService {

	@Autowired
	private IBrandRepo brandRepository;

	public Brand getBrandById(int id) {
		
		Brand obj = brandRepository.findById(id).get();
		return obj;
	}

	public List<Brand> getBrandByProductID(int productId) {
		
		List<Brand> list = new ArrayList<>();
		brandRepository.findByProductId(productId).forEach(e -> list.add(e));
		return list;

	}

	public List<Brand> getAllBrands() {
                                         
		List<Brand> list = new ArrayList<>();
		brandRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	public List<Brand> getBrandByName(String brand) {
		
		List<Brand> list = new ArrayList<>();
		brandRepository.findByBrand(brand).forEach(e -> list.add(e));
		return list;

	}

}
