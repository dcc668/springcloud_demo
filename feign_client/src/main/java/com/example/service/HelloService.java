package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by DongChenchen on 2018/9/30 0030
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 * 调用了service-hi服务的“/hi”接口
 */
@FeignClient(value = "service-hi",fallback = HelloServiceImp.class)
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
