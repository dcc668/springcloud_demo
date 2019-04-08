package com.example.service;

/**
 * Created by DongChenchen on 2018/9/30 0030
 */
public class HelloServiceImp implements HelloService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
