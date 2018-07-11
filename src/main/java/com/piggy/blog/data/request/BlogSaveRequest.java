package com.piggy.blog.data.request;

import lombok.Data;

import java.util.Date;

/**
 * 添加博文请求参数类
 * @author 韦函露
 */
@Data
public class BlogSaveRequest {

    /**
     * 博文标题
     */
    private String title;

    /**
     * 博文摘要
     */
    private String abs;

    /**
     * 博文内容
     */
    private String content;

    /**
     * 博文创建时间
     */
    private Long createTime;

    /**
     * 博文作者
     */
    private String username;
}
