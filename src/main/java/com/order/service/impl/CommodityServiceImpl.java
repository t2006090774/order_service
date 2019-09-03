package com.order.service.impl;

import com.order.bean.Commodity;
import com.order.bean.response.CommodityTypeResp;
import com.order.repository.CommodityDao;
import com.order.repository.CommodityTypeDao;
import com.order.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;
    @Autowired
    private CommodityTypeDao commodityTypeDao;


    /**
     * 查询商品列表
     * @param shopId
     * @return Commodity
     */
    @Override
    public Map<String,List<Commodity>> getCommodityList(Integer shopId) {

        // 返回数据结构
        Map<String,List<Commodity>> returnMap = new HashMap<>();
        List<Commodity> commodityListTemp;
        // 商品类型id
        List<CommodityTypeResp> ctr = commodityTypeDao.findByShopId(shopId);
        //
        Set<Integer> typeList = new HashSet<>();
        for(CommodityTypeResp i:ctr){
            typeList.add(i.getCommodityType());
        }

        // 查询所有商品列表
        List<Commodity> commoList = commodityDao.findByCommodityTypeIn(typeList);

        // 类型循环
        for(CommodityTypeResp i:ctr){
            // 类型下的列表
            commodityListTemp = new ArrayList<>();
            for (Commodity c:commoList) {
                if(c.getCommodityType()==i.getCommodityType()){
                    commodityListTemp.add(c);
                }
            }
            // 类型不为空-添加至返回列表
            if(commodityListTemp.size()>0){
                returnMap.put(i.getCommodityTypeName(),commodityListTemp);
            }
        }

        return returnMap;
    }
}
