//添加学生信息
package com.steam404.server.controller;

import com.steam404.server.service.appendStudentMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class appendStudentController {
    @PostMapping(value = "appendStudent")
    public int appendStudent(
            @RequestParam String name,
            @RequestParam int id,
            @RequestParam int chinese,
            @RequestParam int math,
            @RequestParam int english
    ) throws IOException {
        appendStudentMessage appendStudentMessage=new appendStudentMessage();
        return appendStudentMessage.appendStudent(name,id,chinese,math,english);
    }
}
