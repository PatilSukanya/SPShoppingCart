package com.springboot.SPShoppingCart.controller;

import com.springboot.SPShoppingCart.service.ProductService;


	import static org.mockito.Mockito.verify;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.Mock;
	import org.mockito.junit.jupiter.MockitoExtension;

	 
	@ExtendWith(MockitoExtension.class)
	 
	public class ProductControllerTest {
		@Mock private ProductService productService;
		 
	    private ProductController productController;
	 
	    @BeforeEach void setUp()
	    {
	        this.productController
	            = new ProductController(this.productService);
	    }
	 
	    @Test void getAllProducts()
	    {
	        productController.getAllProducts();
	        verify(productService).getAllProducts();
	    }
	    
	    @Test void getProductByName()
	    {
	    	productController.getProductByName("Mobile");
	    	verify(productService).getProductByName("Mobile");
	    }
	    

	}
