package com.piggy.blog.dao;

import com.piggy.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Blog数据库访问类
 * @author 韦函露
 */
public interface BlogDao extends JpaRepository<Blog,Integer>{
}
