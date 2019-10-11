package com.spring3di.di17;

public class School {
    private String name;

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
