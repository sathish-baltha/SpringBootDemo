package com.capgemini.in.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.in.bean.Customer;
import com.capgemini.in.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		
		List<Customer> customers=new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public void addCustomer(Customer customer){
		customerRepository.save(customer);
	}
	
	public void updateCustomer(String id,Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
		
	}
}
