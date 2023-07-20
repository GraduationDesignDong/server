package com.steam404.server.service;

import com.steam404.server.pojo.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class appendStudentMessage {
    public int  appendStudent(
            String name,
            int id,
            int chinese,
            int math,
            int english
    )throws IOException {
        student student=new student(name,id,chinese,math,english);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int result=sqlSession.insert("appendStudentMessage", student);
        sqlSession.commit();
        return result;
    }
}
