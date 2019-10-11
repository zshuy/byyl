package com.spring3di.di13;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
//        String resource1 = "com/spring3di/di13/spring-base.xml";
//        String resource2 = "com/spring3di/di13/spring-beans.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(resource1, resource2);
        String resource = "com/spring3di/di13/spring-*.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student)ac.getBean("myStudent");
        Teacher teacher = (Teacher) ac.getBean("myTeacher");
        System.out.println(teacher);
        System.out.println(student);
    }
}
