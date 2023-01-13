package com.balu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.balu.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{}
