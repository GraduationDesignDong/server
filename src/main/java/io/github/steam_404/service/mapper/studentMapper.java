package io.github.steam_404.service.mapper;

import io.github.steam_404.service.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface studentMapper {
    @Select("select * from student")
    public List<Student> selectAllStudent();

    @Insert("insert into student(name, chinese, math, english) value (#{name},#{chinese},#{math},#{english})")
    boolean insertStudent(String name,Integer chinese,Integer math,Integer english);

    @Delete("delete from students.student where name=#{name}")
    boolean deleteStudent(String name);

    @Select("select (student.name) from students.student where name=#{name}")
    public String selectStudent(String name);

}
