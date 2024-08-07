package com.boot.core.spring_boot_core_example.components;

import org.springframework.stereotype.Component;

@Component("student45")
public class Student {

    private String name="default";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student()
    {
        System.out.println("Creating Student Object");
    }

    public void study()
    {
        System.out.println("Student is Studying " + name);
    }
}
