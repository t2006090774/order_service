package com.order.repository;

import com.order.bean.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CommodityDao extends JpaRepository<Commodity,Long> {

    List<Commodity> findByCommodityTypeIn(Set<Integer> shopId);
}
