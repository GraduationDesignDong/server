package com.steam404.server.service;

// 修改学生姓名业务

import com.steam404.server.pojo.fixName;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class fixupMessage {
    public int fixup(
            String newName,
            String oldName
    ) throws IOException {
        fixName fixname = new fixName();
        fixname.setNewName(newName);
        fixname.setOldName(oldName);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int result = sqlSession.update("fixupStudentMessage", fixname);
        sqlSession.commit();
        return result;
    }
}
