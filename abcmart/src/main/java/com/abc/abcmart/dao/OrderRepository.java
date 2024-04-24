package com.abc.abcmart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.abcmart.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
