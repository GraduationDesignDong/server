package com.steam404.server.service;

// 修改学生成绩业务

import com.steam404.server.pojo.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class fixupAchievementMessage {
    public int fixupAchievement(
            String name,
            int chinese,
            int math,
            int english
    ) throws IOException {
        student studentMessage=new student();
        studentMessage.setName(name);
        studentMessage.setChinese(chinese);
        studentMessage.setMath(math);
        studentMessage.setEnglish(english);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int result = sqlSession.update("fixupAchievementMessage",studentMessage );
        sqlSession.commit();
        return result;
    }
}
