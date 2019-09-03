package com.order.bean.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @program: order-service
 * @description:
 * @author: jax
 * * @create: 2019-08-30 14:51
 **/
@Entity
@Table(name="user")
public class UserResp {

    @Id
    private Long id;
    @Column(length = 50)
    private String username;
    private String wechatNumber;
    private Integer phoneNumber;
    private Date createTime;

    public UserResp() {
    }

    public UserResp(String wechatNumber, Integer phoneNumber) {
        this.wechatNumber = wechatNumber;
        this.phoneNumber = phoneNumber;
        this.createTime = new Date();
        this.username = wechatNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
