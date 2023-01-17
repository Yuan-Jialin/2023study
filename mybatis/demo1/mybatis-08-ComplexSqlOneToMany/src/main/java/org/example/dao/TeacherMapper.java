package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {

    public List<Teacher> getTeacherById(@Param("id") int id);

    public List<Teacher> getTeacherById2(@Param("id") int id);


}
