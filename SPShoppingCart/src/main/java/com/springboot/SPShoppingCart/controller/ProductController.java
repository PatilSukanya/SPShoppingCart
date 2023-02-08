package com.springboot.SPShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SPShoppingCart.entity.Product;
import com.springboot.SPShoppingCart.service.ProductService;

@RestController
//@RequestMapping("/api")
public class ProductController {


	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService=productService;
	}

	@GetMapping("products/id/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
		Product product = productService.getProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@GetMapping("products/name/{name}")
	public ResponseEntity<List<Product>> getProductByName(@PathVariable("name") String name) {
		List<Product> list = productService.getProductByName(name);
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllProducts() {
				
		List<Product> list = productService.getAllProducts();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}
}