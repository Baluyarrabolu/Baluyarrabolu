package com.balu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.balu.dto.CustomerDto;
import com.balu.entity.Customer;
import com.balu.exception.CustomerNotFoundException;
import com.balu.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer saveCustomer(CustomerDto customerDto) {
		
		Customer customer=Customer.builder().name(customerDto.getName()).address(customerDto.getAddress()).build();
		return customerRepo.save(customer);
	}
	
	public Customer getCustomerById(int id) {

		return customerRepo.findById(id).orElseThrow(() -> new CustomerNotFoundException("No customer exist with this id: " + id));
	}
}
