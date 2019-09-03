package com.order.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: order-service
 * @description:
 * @author: jax
 * * @create: 2019-08-30 14:43
 **/
@Entity
@Table(name="order_commodity")
public class OrderCommodity {

    @Id
    private Long id;
    @Column
    private Integer num;
    @Column
    private Integer commodityId;
    @Column
    private String orderId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
