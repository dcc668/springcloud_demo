package com.example.docker_maven_plugin.controller;

import com.example.common.consts.Consts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DongChenchen
 * @date : 2019/4/14  11:31
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    public String index(){
        String res="Result:"+Consts.REDIS_HOST_URL;
        return res;
    }
}
