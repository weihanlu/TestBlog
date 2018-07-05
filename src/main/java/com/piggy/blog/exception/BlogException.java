package com.piggy.blog.exception;

import com.piggy.blog.data.constant.Status;

/**
 * 自定义异常类
 * @author 韦函露
 */
public class BlogException extends RuntimeException{

    private Integer code;

    public Integer getCode() {
        return code;
    }
    public BlogException(Status.ApiErr apiErr){
        super(apiErr.getMsg());
        this.code = apiErr.getCode();
    }
}
