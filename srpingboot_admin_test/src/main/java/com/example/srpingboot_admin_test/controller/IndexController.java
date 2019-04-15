package com.example.srpingboot_admin_test.controller;

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
        String res="Success!";
        return res;
    }
}
