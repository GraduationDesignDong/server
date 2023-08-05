//删除学生接口
package com.steam404.server.controller;

import com.steam404.server.service.removeStudentMessage;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class removeStudentController {
    @DeleteMapping(value = "removeStudent")
    public int removeStudent(
            @RequestParam String name
    ) throws IOException {
        removeStudentMessage removeStudentMessage=new removeStudentMessage();
        return removeStudentMessage.removeStudent(name);
    }
}
