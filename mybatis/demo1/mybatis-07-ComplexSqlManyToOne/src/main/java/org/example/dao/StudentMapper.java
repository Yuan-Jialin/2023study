package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Student;
import org.example.pojo.Teacher;

import java.util.List;

public interface StudentMapper {

        public List<Student>getAllStudent();

        public List<Student>getAllStudent2();
}
