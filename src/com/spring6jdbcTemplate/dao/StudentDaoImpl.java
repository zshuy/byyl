package com.spring6jdbcTemplate.dao;

import com.spring6jdbcTemplate.beans.Student;
import com.spring6jdbcTemplate.beans.StudentRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {
    @Override
    public void insertStudent(Student student) {
        String sql = "INSERT INTO student(name, age) VALUES (?, ?)";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        this.getJdbcTemplate().update(sql, id);
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, age = ? WHERE id = ?";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());
    }

    @Override
    public List<Student> selectAllStudents() {
        String sql = "SELECT * FROM student";
        return this.getJdbcTemplate().query(sql, new StudentRowMapper());
    }

    @Override
    public Student selectStudentById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        return this.getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), id);
    }

    @Override
    public List<String> selectAllStudentNames() {
        String sql = "SELECT name FROM student";
        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class);
        return list;
    }

    @Override
    public String selectStudentNameById(int id) {
        String sql = "SELECT name FROM student WHERE id = ?";
        String student = this.getJdbcTemplate().queryForObject(sql, String.class, id);
        return student;
    }
}
