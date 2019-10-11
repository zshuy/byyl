package com.spring3di.di08;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name setter()");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age setter()");
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
