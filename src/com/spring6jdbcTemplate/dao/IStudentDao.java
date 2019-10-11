package com.spring6jdbcTemplate.dao;

import com.spring6jdbcTemplate.beans.Student;

import java.util.List;

public interface IStudentDao {
    void insertStudent(Student student);
    void deleteById(int id);
    void updateStudent(Student student);

    List<Student> selectAllStudents();
    Student selectStudentById(int id);

    List<String> selectAllStudentNames();
    String selectStudentNameById(int id);
}
