package com.piggy.blog.data.request;

import lombok.Data;

/**
 * 删除博文请求参数类
 * @author 韦函露
 */
@Data
public class BlogDeleteRequest {

    /**
     * 博文ID
     */
    private Integer blogId;
}
