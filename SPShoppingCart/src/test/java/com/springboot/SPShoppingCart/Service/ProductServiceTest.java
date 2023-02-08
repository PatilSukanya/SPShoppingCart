package com.springboot.SPShoppingCart.Service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springboot.SPShoppingCart.repository.IProductRepo;
import com.springboot.SPShoppingCart.service.ProductService;

 
@ExtendWith(MockitoExtension.class)
 
public class ProductServiceTest {
	@Mock private IProductRepo productRepository;
	 
    private ProductService productService;
 
    @BeforeEach void setUp()
    {
        this.productService
            = new ProductService(this.productRepository);
    }
 
    @Test void getAllProducts()
    {
        productService.getAllProducts();
        verify(productRepository).findAll();
    }
    
    @Test void getProductByName()
    {
        productService.getProductByName("Mobile");
        verify(productRepository).findByName("Mobile");
    }
    

}
