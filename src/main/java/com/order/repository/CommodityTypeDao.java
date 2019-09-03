package com.order.repository;

import com.order.bean.response.CommodityTypeResp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityTypeDao extends JpaRepository<CommodityTypeResp,Long> {

    List<CommodityTypeResp> findByShopId(Integer shopId);
}
