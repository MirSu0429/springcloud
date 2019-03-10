package com.su.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: supengfei
 * @Date: 2019/3/10 13:55
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String test(@RequestParam("str") String s){
        return "调用的端口是:" + port + "接收到的参数是:" + s ;
    }
    @RequestMapping("/test2")
    public String test2(){
        return "调用的端口是:" + port  ;
    }
}
