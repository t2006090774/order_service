package com.order.controller;

import com.order.bean.JSONResult;
import com.order.bean.Order;
import com.order.bean.OrderCommodity;
import com.order.service.OrderService;
import com.order.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: order-service
 * @description:
 * @author: jax
 * * @create: 2019-08-30 16:51
 **/
@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    @ResponseBody
    public JSONResult createOrder(Order order){
        if(StringUtils.isEmpty(order.getOrderCommodityList())){
            JSONResult.errorMsg("商品订单信息不可为空");
        }
        List<OrderCommodity> ocl = new ArrayList<>();
        // 商品下单列表
        String orderCommodityList;
        OrderCommodity oclTemp;
        // 订单id
        String orderId = MyUtils.getUUID();
        order.setOrderId(orderId);
        try{
            orderCommodityList = order.getOrderCommodityList();
            List<String> commoList = Arrays.asList(orderCommodityList.split(","));
            for(String s:commoList){
                oclTemp = new OrderCommodity();
                oclTemp.setCommodityId(Integer.valueOf(s.split("-")[0]));
                oclTemp.setNum(Integer.valueOf(s.split("-")[1]));
                oclTemp.setOrderId(orderId);
                ocl.add(oclTemp);
            }
        }catch (Exception e){
            JSONResult.errorMsg("商品订单数据解析错误");
        }

        Boolean b = orderService.createOrder(order,ocl);
        return b?JSONResult.succeed("创建订单成功！"):JSONResult.errorMsg("创建订单失败！");
    }


}
