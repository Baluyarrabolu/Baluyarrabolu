package com.balu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balu.entity.Order;
import com.balu.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	//save Method
	@Override
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
	
	//update Method
	@Override
	public Order updateOrder(Order order) {
		Order getdata = getOrder(order.getOrderId());
		Order updateData = new Order();
		
		if(getdata!=null) {
			updateData.setOrderId(order.getOrderId());
			updateData.setAddress(getdata.getAddress());
			updateData.setOrderName(getdata.getOrderName());
			updateData.setPrice(order.getPrice());
			}
			
		return orderRepository.save(updateData);
	}
	
	//get Method
	@Override
	public Order getOrder(Long orderId) {
		return orderRepository.findById(orderId).orElseThrow(()->new RuntimeException("Id not found!!!"));
	} 
	
	//delete Method
	@Override
	public Boolean deleteOrder(Long orderId) {
		orderRepository.deleteById(orderId);
		return true;
	}
}
