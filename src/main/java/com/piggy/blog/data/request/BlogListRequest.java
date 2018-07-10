package com.piggy.blog.data.request;

import lombok.Data;

/**
 * 获取博客列表请求参数类
 * @author 韦函露
 */
@Data
public class BlogListRequest {
    /**
     * 用户名
     */
    private String username;
}
