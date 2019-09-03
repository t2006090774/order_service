package com.order.utils;

import java.util.UUID;

/**
 * @program: order-service
 * @description:
 * @author: jax
 * * @create: 2019-09-02 14:46
 **/
public class MyUtils {


    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    }
}
