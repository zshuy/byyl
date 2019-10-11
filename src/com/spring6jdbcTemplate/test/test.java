package com.spring6jdbcTemplate.test;

import com.spring6jdbcTemplate.beans.Student;
import com.spring6jdbcTemplate.dao.IStudentDao;
import com.spring6jdbcTemplate.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    IStudentService service = null;

    @Before
    public void before() {
        String resource = "com/spring6jdbcTemplate/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (IStudentService) ac.getBean("myService");
    }

    @Test
    public void test01() {
        Student student = new Student("张三", 21);
        service.addStudent(student);
    }

    @Test
    public void test02() {
        service.removeById(3);
    }

    @Test
    public void test03() {
        Student student = new Student("王五", 22);
        student.setId(2);
        service.modifyStudent(student);
    }

    @Test
    public void test04() {
        System.out.print(service.findAllStudents());

        System.out.println("\n" + service.findStudentById(4));
    }

    @Test
    public void test05() {
        for (String name : service.findAllStudentNames()) {
            System.out.print(name + "--");
        }

        System.out.println("\n" + service.findStudentNameById(2));
    }
}
