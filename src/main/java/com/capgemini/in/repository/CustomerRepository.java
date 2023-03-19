package com.capgemini.in.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.in.bean.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
