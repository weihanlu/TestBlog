package com.piggy.blog.service;

import com.piggy.blog.data.request.BlogDeleteRequest;
import com.piggy.blog.data.request.BlogListRequest;
import com.piggy.blog.data.request.BlogSaveRequest;
import com.piggy.blog.data.response.Resp;

import java.util.List;

/**
 * 博客页面service层接口
 * @author 韦函露
 */
public interface BlogService {

    /**
     * 获取所有博客列表
     * @return Resp
     */
    Resp getBlogAll();
    /**
     * 获取用户的博客列表
     * @param blogListRequest
     * @return Resp
     */
    Resp getBlogList(BlogListRequest blogListRequest);

    /**
     * 保存编辑的博客
     * @param blogSaveRequest
     * @return Resp
     */
    Resp save(BlogSaveRequest blogSaveRequest);

    /**
     * 删除博客
     * @param blogDeleteRequest
     * @return Resp
     */
    Resp delete(BlogDeleteRequest blogDeleteRequest);
}
