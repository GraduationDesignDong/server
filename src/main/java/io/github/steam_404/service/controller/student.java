package io.github.steam_404.service.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.github.steam_404.service.entity.Student;
import io.github.steam_404.service.service.studentService;

import java.util.List;

@RestController
public class student {
    @Resource
    private studentService studentService;
    @GetMapping(value = "allStudent")
    public List<Student> allStudent(){
        return studentService.selectAllStudent();
    }
    @GetMapping(value = "insertStudent")
    public boolean insertStudent(
            @RequestParam String name,
            @RequestParam Integer chinese,
            @RequestParam Integer math,
            @RequestParam Integer english
    ){
        return studentService.insertStudent(name, chinese, math, english);
    }
    @GetMapping(value = "deleteStudent")
    public boolean deleteStudent(String name){
        return studentService.deleteStudent(name);
    }
}
