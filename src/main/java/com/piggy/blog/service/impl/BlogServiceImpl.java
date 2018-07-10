package com.piggy.blog.service.impl;

import com.piggy.blog.dao.BlogDao;
import com.piggy.blog.data.request.BlogListRequest;
import com.piggy.blog.data.response.Resp;
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
    public Resp getBlogList(BlogListRequest blogListRequest) throws BlogException{
        return RespUtil.successResp(blogDao.findAllByUsername(blogListRequest.getUsername()));
    }
}
