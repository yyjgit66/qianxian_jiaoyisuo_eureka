package com.qianxian.test.controller;

import com.qianxian.test.serviceImpl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestServiceImpl testService;
    @GetMapping("save")
    public void save(){
        testService.save();
    }
}
