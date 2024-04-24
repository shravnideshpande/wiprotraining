package com.abc.abcmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.abcmart.dao.CustomerRepository;
import com.abc.abcmart.entity.Customer;
import com.abc.abcmart.exception.CustomerNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer>optionalCustomer=customerRepository.findById(customerId);
		if(optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Customer does not exist with id:"+customerId);
		}
	
		Customer customer = optionalCustomer.get();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customers = customerRepository.findAll();
	      return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
      Optional<Customer> optionalCustomer= customerRepository.findById(customer.getCustomerId());
		if(optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Customer does not exist with id:"+customer.getCustomerId());
		}
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int customerid) {
    Optional<Customer> optionalCustomer = customerRepository.findById(customerid);	
    if(optionalCustomer.isEmpty()) {
    	throw new CustomerNotFoundException("Customer does not exist with id:"+customerid);
    }
    Customer customer = optionalCustomer.get();
    customerRepository.delete(customer);
	}


}
