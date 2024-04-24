package com.abc.abcmart.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.abc.abcmart.dao.CustomerRepository;
import com.abc.abcmart.entity.Customer;
import com.abc.abcmart.exception.CustomerNotFoundException;

@SpringBootTest

public class CustomerServiceTest {

      @InjectMocks
      CustomerServiceImpl customerService;
         @Mock
      CustomerRepository customerRepository;
      
         @Test
      public void testCustomerDetails() {
             
       Customer customer = new Customer();
         customer.setCustomerId(101);
         customer.setCustomerName("ABC");
         customer.setEmail("abc@gmail.com");
         customer.setMobile("8976542301");
          when(customerRepository.findById(101)).thenReturn(Optional.of(customer));
          
          Customer obj = customerService.getCustomerById(101);
          assertEquals("ABC",obj.getCustomerName());
        }
      
      
         @Test
     	public void testGetCustomerDetailsException() {
     		when(customerRepository.findById(100)).thenThrow(new CustomerNotFoundException("Customer not existing with id: 109"));
     	     assertThrows(CustomerNotFoundException.class,()->customerService.getCustomerById(100));
     	}



}
