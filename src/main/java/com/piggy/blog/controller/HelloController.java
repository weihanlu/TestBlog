package com.piggy.blog.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
<<<<<<< HEAD
 *
=======
 * hello my blog接口类
>>>>>>> master
 * @author 韦函露
 */

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello my blog!";
    }
}
