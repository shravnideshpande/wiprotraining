package com.abc.abcmart.service;

import java.util.List;

import com.abc.abcmart.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(int customerId);
	List<Customer> getAllCustomer();
	
	Customer updateCustomer(Customer customer);
	void deleteCustomer(int customerid);
}
