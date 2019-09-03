package com.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: order-service
 * @description:
 * @author: jax
 * * @create: 2019-08-30 13:30
 **/
@RestController
@RequestMapping("api/test")
public class TestController {

    @GetMapping(value = "/hello")
    public String test(){
        return "hello Test";
    }
}
