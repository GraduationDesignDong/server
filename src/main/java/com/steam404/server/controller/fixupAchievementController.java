package com.steam404.server.controller;

// 修改学生成绩接口

import com.steam404.server.service.fixupAchievementMessage;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class fixupAchievementController {
    @PutMapping(value = "fixupAchievement")
    public int fixupAchievement(
            @RequestParam String name,
            @RequestParam int chinese,
            @RequestParam int math,
            @RequestParam int english
    ) throws IOException {
        fixupAchievementMessage fixupAchievementMessage=new fixupAchievementMessage();
        return fixupAchievementMessage.fixupAchievement(name,chinese,math,english);
    }
}
