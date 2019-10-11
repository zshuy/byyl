package com.spring6jdbcTemplate.beans;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student(resultSet.getString("name"), resultSet.getInt("age"));
        student.setId(resultSet.getInt("id"));
        return student;
    }
}
