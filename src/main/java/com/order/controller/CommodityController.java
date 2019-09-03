package com.order.controller;

import com.order.bean.JSONResult;
import com.order.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: order-service
 * @description:
 * @author: jax
 * * @create: 2019-08-30 16:51
 **/
@RestController
@RequestMapping("api/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @GetMapping("/commodityList/{shopId}")  //
    public JSONResult commodityList(@PathVariable("shopId") Integer shopId){

        /*if(StringUtils.isEmpty(commodityType)){
            return JSONResult.errorMsg("商品类型不可为空");
        }*/
        return JSONResult.succeed(commodityService.getCommodityList(shopId));
    }
}
