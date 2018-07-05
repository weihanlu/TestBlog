package com.piggy.blog.controller;


import com.piggy.blog.data.constant.Status;
import com.piggy.blog.data.response.Resp;
import com.piggy.blog.exception.BlogException;
import com.piggy.blog.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

/**
 * 博客页面接口类
 *
 * @author 韦函露
 */

@RestController
@RequestMapping("/blog")
public class BlogController {

    @GetMapping(value = "/list")
    public Resp blogList(@RequestParam(value = "id",defaultValue = "0") Integer id){
         if(id != 1){
             throw new BlogException(Status.ApiErr.PERMISSION_DENIED);
         }
         return RespUtil.successResp("blog title+blog abstract");
    }
}
