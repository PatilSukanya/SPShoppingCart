package com.springboot.SPShoppingCart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.SPShoppingCart.entity.Product;
import com.springboot.SPShoppingCart.repository.IProductRepo;

@Component
public class ProductService {
	
	@Autowired
	private IProductRepo productRepository;

	
	public ProductService(IProductRepo productRepository) {
		this.productRepository=productRepository;
	}

	public Product getProductById(int id) {
		Product obj = productRepository.findById(id).get();
		return obj;
	}
	
		public List<Product> getAllProducts() {
		
		List<Product> list = new ArrayList<>();
		productRepository.findAll().forEach(e -> list.add(e));
		
		return list;
	}

	public List<Product> getProductByName(String name) {;
		List<Product> list = new ArrayList<>();
	    productRepository.findByName(name).forEach(e -> list.add(e));
	    return list;
	    
	}
	

//	public void updProduct(int id, int soldCount) {
//		Product obj = productRepository.findById(id).get();
//		int quantity =obj.getQuantity()-soldCount;
//		obj.setQuantity(quantity);
//		if(quantity<=0) {
//			obj.setStatus("Sold Out");
//		}
//		
//		if(quantity==1) {
//			obj.setStatus("Hurry Up 1 Left");
//		}
//		
//		if(quantity>1) {
//			obj.setStatus("Available");
//		}
//		productRepository.save(obj);
//	}
}
