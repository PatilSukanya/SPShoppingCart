package com.springboot.SPShoppingCart.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SPShoppingCart.entity.Orders;
import com.springboot.SPShoppingCart.service.OrderService;







@RestController
public class OrderController {



@Autowired
OrderService orderService;

@PostMapping("/orders")
public ResponseEntity<Orders> saveCustomer(@RequestBody Orders orders) {
return orderService.save(orders);
}

@GetMapping("/orders")
public ResponseEntity<List<Orders>> getAllOrders() {
			
	List<Orders> list = orderService.getAllOrders();
	return new ResponseEntity<List<Orders>>(list, HttpStatus.OK);
}

@GetMapping("orders/id/{id}")
public ResponseEntity<Orders> getBrandById(@PathVariable("id") int id) {
	Orders orders = orderService.getOrderById(id);
	return new ResponseEntity<Orders>(orders, HttpStatus.OK);
}

}