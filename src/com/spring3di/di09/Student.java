package com.spring3di.di09;


public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name setter()");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age setter()");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
