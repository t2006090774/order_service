package com.order.service;

import com.order.bean.Order;
import com.order.bean.OrderCommodity;

import java.util.List;

public interface OrderService {

    /**
     * 保存订单
     * @param order
     * @return
     */
    Boolean createOrder(Order order, List<OrderCommodity> ocl);

}
