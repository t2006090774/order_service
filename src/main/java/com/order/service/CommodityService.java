package com.order.service;

import com.order.bean.Commodity;

import java.util.List;
import java.util.Map;

public interface CommodityService {

    /**
     * 商品列表
     * @param shopId
     * @return
     */
     Map<String,List<Commodity>> getCommodityList(Integer shopId);

}
