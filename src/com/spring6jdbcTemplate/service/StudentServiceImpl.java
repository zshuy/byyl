package com.spring6jdbcTemplate.service;

import com.spring6jdbcTemplate.beans.Student;
import com.spring6jdbcTemplate.dao.StudentDaoImpl;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private StudentDaoImpl dao;

    public void setDao(StudentDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> list = dao.selectAllStudents();
        return list;
    }

    @Override
    public Student findStudentById(int id) {
        Student student = dao.selectStudentById(id);
        return student;
    }

    @Override
    public List<String> findAllStudentNames() {
        List<String> list = dao.selectAllStudentNames();
        return list;
    }

    @Override
    public String findStudentNameById(int id) {
        String name = dao.selectStudentNameById(id);
        return name;
    }
}
