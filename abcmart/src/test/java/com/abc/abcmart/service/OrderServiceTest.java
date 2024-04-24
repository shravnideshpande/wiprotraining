package com.abc.abcmart.service;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.abc.abcmart.dao.OrderRepository;
import com.abc.abcmart.entity.Customer;
import com.abc.abcmart.entity.Order;

@SpringBootTest
public class OrderServiceTest {

        @InjectMocks
       OrderServiceImpl OrderService;
      
         @Mock
      OrderRepository orderrepository;

      @Test
       public void testOrderDetails() {
    	   
    	   Order order = new Order();
    	   Customer customer = new Customer();
    	   order.setOrderId(1001);
           order.setOrderDate(LocalDate.now());
           order.setOrderStatus("Pending");
           order.setCustomer(customer);
           when(orderrepository.findById(1001)).thenReturn(Optional.of(order));
          
  }


}
