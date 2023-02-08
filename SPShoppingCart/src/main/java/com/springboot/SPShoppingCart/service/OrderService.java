package com.springboot.SPShoppingCart.service;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.springboot.SPShoppingCart.entity.Orders;
import com.springboot.SPShoppingCart.repository.IOrderRepo;



@Service
public class OrderService {

@Autowired
IOrderRepo orderRepository;



		public ResponseEntity<Orders> save(Orders orders) {
			try {
				return new ResponseEntity<>(orderRepository.save(orders), HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}



	public List<Orders> getAllOrders() {
		
		List<Orders> list = new ArrayList<>();
		orderRepository.findAll().forEach(e -> list.add(e));;
		return list;
	}
	public Orders getOrderById(int id) {
		Orders obj = orderRepository.findById(id).get();
		return obj;
	}
	


}