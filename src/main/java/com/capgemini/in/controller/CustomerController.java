package com.capgemini.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.in.bean.Customer;
import com.capgemini.in.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method= RequestMethod.GET,value="/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customers" )
	public void addCutomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/customers/{id}")
	public void updateCustomer(@PathVariable String id,@RequestBody Customer customer) {
		customerService.updateCustomer(id,customer);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/customers/{id}")
	public void deletteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}
}
