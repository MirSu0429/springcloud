package com.su.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: supengfei
 * @Date: 2019/3/10 16:21
 * @Description:
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${demo.port}")
    private String port;
    @Value("${demo.title}")
    private String title;

    @RequestMapping("/test")
    public String test() {
        return "port:" + port + "----" + "title:" + title;
    }

}
