package com.piggy.blog.dao;

import com.piggy.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Blog数据库访问类
 * @author 韦函露
 */

public interface BlogDao extends JpaRepository<Blog,Integer>{
    /**
     * 根据用户名获取博客列表
     * @param username
     * @return
     */
    List<Blog> findAllByUsername(String username);
}
