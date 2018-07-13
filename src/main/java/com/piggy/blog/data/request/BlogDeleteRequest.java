package com.piggy.blog.data.request;

import com.piggy.blog.data.constant.Status;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.*;

/**
 * 删除博文请求参数类
 * @author 韦函露
 */
@Data
public class BlogDeleteRequest {

    /**
     * 博文ID
     */
    @NotBlank
    private Integer blogId;
}
