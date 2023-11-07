package io.github.steam_404.service.service;

import io.github.steam_404.service.entity.Student;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import io.github.steam_404.service.mapper.studentMapper;

import java.util.List;

@Service
public class studentService implements studentMapper{
    @Resource
    private studentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public boolean insertStudent(String name, Integer chinese, Integer math, Integer english) {
        if(selectStudent(name).isEmpty()){
            return studentMapper.insertStudent(name,chinese,math,english);
        }else {
            System.out.println("学生已存在");
            return false;
        }
    }

    @Override
    public boolean deleteStudent(String name) {
        return studentMapper.deleteStudent(name);
    }

    @Override
    public String selectStudent(String name) {
        return studentMapper.selectStudent(name);
    }
}
