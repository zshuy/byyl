package com.spring3di.di11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring3di/di11/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student[] students = new Student[3];
        for(int i = 0 ; i < 3 ; i++) {
            students[i] = (Student)ac.getBean("myStudent" + (i + 1));
        }
        System.out.println(Arrays.toString(students));
    }
}
