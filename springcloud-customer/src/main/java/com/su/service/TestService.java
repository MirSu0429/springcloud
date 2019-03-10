package com.su.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: supengfei
 * @Date: 2019/3/10 14:03
 * @Description:
 */
@FeignClient("springcloud-server")
public interface TestService {
    @RequestMapping("/api/test")
    String test(@RequestParam("str") String str);
}
