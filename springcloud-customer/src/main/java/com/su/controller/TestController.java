package com.su.controller;

import com.su.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: supengfei
 * @Date: 2019/3/10 14:02
 * @Description:
 */
@RestController
@RequestMapping("/cust")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/test")
    public String testCustomer(){
        String s = "请求参数";
        return testService.test(s);
    }


}
