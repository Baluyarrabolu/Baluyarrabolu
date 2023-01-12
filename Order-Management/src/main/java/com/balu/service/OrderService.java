package com.balu.service;

import com.balu.entity.Order;

public interface OrderService {

	Order saveOrder(Order order);
	
	Order updateOrder(Order order);
	
	Order getOrder(Long orderId);
	
	Boolean deleteOrder(Long orderId);
	
}
