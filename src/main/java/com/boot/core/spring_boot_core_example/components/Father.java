package com.boot.core.spring_boot_core_example.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class Father {

    private Student student;

    public Father(@Qualifier("student4") Student student)
    {
        this.student=student ;
        System.out.println("creating father");
    }

    public void useStudent()
    {
        System.out.println("using student");
        student.study();
    }




}
