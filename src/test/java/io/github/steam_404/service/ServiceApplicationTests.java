package io.github.steam_404.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.steam_404.service.mapper.studentMapper;

@SpringBootTest
class ServiceApplicationTests {

//	@Test
//	void contextLoads() {
//	}
@Autowired
private studentMapper studentMapper;

	@Test
	public void testSelectStudent(){
		System.out.println(studentMapper.selectAllStudent());
	}

	@Test
	public void testInsertStudent(){
		System.out.println(studentMapper.insertStudent("ikun",100,100,100));
	}

	@Test
	public void testSelectStudentMessage(){
		System.out.println(studentMapper.selectStudent("ikun1"));
	}
}
