package com.piggy.blog.service.impl;

import com.piggy.blog.dao.BlogDao;
import com.piggy.blog.data.request.BlogDeleteRequest;
import com.piggy.blog.data.request.BlogListRequest;
import com.piggy.blog.data.request.BlogSaveRequest;
import com.piggy.blog.data.response.Resp;
import com.piggy.blog.entity.Blog;
import com.piggy.blog.exception.BlogException;
import com.piggy.blog.service.BlogService;
import com.piggy.blog.utils.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 博客页面service层实现
 * @author 韦函露
 */
@Service
@Slf4j
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public Resp getBlogAll() {
        return RespUtil.successResp(blogDao.findAll());
    }

    @Override
    public Resp getBlogList(BlogListRequest blogListRequest){
        return RespUtil.successResp(blogDao.findAllByUsername(blogListRequest.getUsername()));
    }

    @Override
    public Resp save(BlogSaveRequest blogSaveRequest) {
        Blog blog = new Blog();
        blog.setTitle(blogSaveRequest.getTitle());
        blog.setAbs(blogSaveRequest.getAbs());
        blog.setContent(blogSaveRequest.getContent());
        blog.setCreateTime(blogSaveRequest.getCreateTime());
        blog.setUsername(blogSaveRequest.getUsername());
        return RespUtil.successResp(blogDao.save(blog));
    }

    @Override
    public Resp delete(BlogDeleteRequest blogDeleteRequest) {
        blogDao.delete(blogDeleteRequest.getBlogId());
        return RespUtil.successResp();
    }
}
