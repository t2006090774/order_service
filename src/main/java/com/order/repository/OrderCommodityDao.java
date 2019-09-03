package com.order.repository;

import com.order.bean.OrderCommodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCommodityDao extends JpaRepository<OrderCommodity,Long> {
//    OrderCommodity saveAll(List<OrderCommodity> list);
}
