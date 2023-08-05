package com.steam404.server.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping(value = "get")
    public String getTest(){
        return "getTest";
    }
    @PostMapping(value = "post")
    public String postTest(){
        return "postTest";
    }
}
