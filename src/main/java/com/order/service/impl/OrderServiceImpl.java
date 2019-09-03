package com.order.service.impl;

import com.order.bean.Order;
import com.order.bean.OrderCommodity;
import com.order.bean.User;
import com.order.repository.OrderCommodityDao;
import com.order.repository.OrderDao;
import com.order.repository.UserDao;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderCommodityDao orderCommodityDao;
    @Autowired
    private UserDao userDao;

    /**
     * 保存订单
     * @param order
     * @return
     */
    public Boolean createOrder(Order order, List<OrderCommodity> ocl) {
        // 保存新用户
        if(userDao.findByWechatNumber(order.getWechatNumber()).size()<1){
            userDao.save(new User(order.getWechatNumber(),order.getPhoneNumber()));
        }
        // check订单
        // 保存订单
        orderDao.save(order);
        for(OrderCommodity i:ocl){
            orderCommodityDao.save(i);
        }
        return true;
    }
}
