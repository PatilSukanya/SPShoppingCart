package com.springboot.SPShoppingCart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.SPShoppingCart.entity.Brand;
import com.springboot.SPShoppingCart.service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	private BrandService brandService;

	@GetMapping("brands/id/{id}")
	public ResponseEntity<Brand> getBrandById(@PathVariable("id") int id) {
		Brand brand = brandService.getBrandById(id);
		return new ResponseEntity<Brand>(brand, HttpStatus.OK);
	}
	
	@GetMapping("brands/brand/{name}")
	public ResponseEntity<List<Brand>> getBrandByName(@PathVariable("name") String name) {
		List<Brand> list = brandService.getBrandByName(name);
		return new ResponseEntity<List<Brand>>(list, HttpStatus.OK);
	}
	@GetMapping("brands/productId/{productId}")
	public ResponseEntity<List<Brand>> getBrandByProductID(@PathVariable("productId") int productId) {
		List<Brand> list = brandService.getBrandByProductID(productId);
		return new ResponseEntity<List<Brand>>(list, HttpStatus.OK);
	}

	@GetMapping("brands")
	public ResponseEntity<List<Brand>> getAllBrands() {
				
		List<Brand> list = brandService.getAllBrands();
		return new ResponseEntity<List<Brand>>(list, HttpStatus.OK);
	}

}
