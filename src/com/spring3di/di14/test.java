package com.spring3di.di14;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        String resource = "com/spring3di/di14/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Teacher teacher = (Teacher) ac.getBean("myTeacher");
        System.out.println(teacher);
        Student student = (Student)ac.getBean("myStudent");
        System.out.println(student);
    }
}
