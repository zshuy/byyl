package com.spring3di.di17;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//充当容器
//Configuration 表示当前类充当Spring容器，即所有的Bean将由本类来创建
@Configuration
public class MyJavaConfig {
//    @Bean(name = "myStudent", autowire = Autowire.BY_TYPE)//byType方式获取  从当前类这个容器中查找与域属性类型具有is-a关系的Bean
//    public Student getStudent() {
//    return new Student("张三", 23);
//}
//
//    @Bean(name = "mySchool")
//    public School getSchool() {
//        return new School("西安邮电大学");
//    }

    @Bean(name = "myStudent", autowire = Autowire.BY_NAME)//byName方式获取  从当前类这个容器中查找与域属性同名的Bean
    public Student getStudent() {
        return new Student("张三", 23);
    }

    @Bean(name = "school")
    public School getSchool() {
        return new School("西安邮电大学");
    }
}
