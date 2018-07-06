package com.piggy.blog.dao;


import com.piggy.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User数据库访问类
 *
 * @author 韦函露
 */
public interface UserDao extends JpaRepository<User, String> {
}
