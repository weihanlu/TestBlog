package com.piggy.blog.data.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 获取博客列表请求参数类
 * @author 韦函露
 */
@Data
public class BlogListRequest {
    /**
     * 用户名
     */
    @NotBlank
    private String username;
}
