package com.example.wmsserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.wmsserver.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{
	
}