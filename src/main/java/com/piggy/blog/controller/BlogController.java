package com.piggy.blog.controller;


import com.mysql.jdbc.log.LogFactory;
import com.mysql.jdbc.log.LogUtils;
import com.piggy.blog.data.constant.Status;
import com.piggy.blog.data.request.BlogListRequest;
import com.piggy.blog.data.response.Resp;
import com.piggy.blog.exception.BlogException;
import com.piggy.blog.service.BlogService;
import com.piggy.blog.utils.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.logging.Logger;

/**
 * 博客页面Controller层
 *
 * @author 韦函露
 */

@RestController
@RequestMapping("/blog")
@Slf4j
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping(value = "/list")
    @ResponseBody
    public Resp blogList(@RequestBody BlogListRequest blogListRequest) throws BlogException{
        return blogService.getBlogList(blogListRequest);
    }
    
}
