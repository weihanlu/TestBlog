package com.piggy.blog.controller;

import com.piggy.blog.data.response.Resp;
import com.piggy.blog.exception.BlogException;
import com.piggy.blog.utils.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 * @author 韦函露
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Resp handleException(Exception e) throws Exception{
        if(e instanceof BlogException){
            BlogException blogException = (BlogException) e;
            return RespUtil.errorResp(blogException.getCode(),blogException.getMessage());
        }else{
            log.error("系统异常", e);
            throw e;
        }
    }

}
