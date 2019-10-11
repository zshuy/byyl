package com.spring3di.di18;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//运行环境
@ContextConfiguration(locations = "classpath:com/spring3di/di18/applicationContext.xml")//配置文件信息   locations是String数组   默认认为在项目根目录下   所以需要加classpath表明
public class test {
    @Autowired
    private Student student;

    @Autowired
    @Qualifier("mySchool")
    private School school;

    @Test
    public void test01() {
        System.out.println(student);
        System.out.println(school);
    }
}
