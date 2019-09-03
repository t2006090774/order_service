package com.order.repository;

import com.order.bean.User;
import com.order.bean.response.UserResp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    List<UserResp> findByWechatNumber(String wechatNumber);
}
