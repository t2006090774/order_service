package com.order.repository;

import com.order.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order,Long> {
    Order save(Order order);
}
