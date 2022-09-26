package com.example.demo.controller;

import com.example.demo.mapper.MyTestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private MyTestMapper myTestMapper;

    @GetMapping("/hello")
    public Integer hello(){
        log.error("error");
        log.info("info");
        log.debug("debug");
        return myTestMapper.getCount2();
    }

    @GetMapping("/getFeederCount")
    public Integer getFeederCount(){
        log.error("getFeederCount error");
        log.info("getFeederCount info");
        log.debug("getFeederCount debug");
        return myTestMapper.getFeederCount();
    }
}
