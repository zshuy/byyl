package com.spring6jdbcTemplate.service;

import com.spring6jdbcTemplate.beans.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void removeById(int id);
    void modifyStudent(Student student);

    List<Student> findAllStudents();
    Student findStudentById(int id);

    List<String> findAllStudentNames();
    String findStudentNameById(int id);
}
