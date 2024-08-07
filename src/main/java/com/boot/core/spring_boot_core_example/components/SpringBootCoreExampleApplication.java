package com.boot.core.spring_boot_core_example.components;

import com.boot.core.spring_boot_core_example.components.controller.HomeController;
import lcwd.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"lcwd","com.boot.core.spring_boot_core_example"})
public class SpringBootCoreExampleApplication {


        public static void main(String[] args) throws InterruptedException {

            //bootstraping your application
            ConfigurableApplicationContext applicationContext= SpringApplication.run(SpringBootCoreExampleApplication.class, args);
            //		Student student=applicationContext.getBean(Student.class);
            //		System.out.println(student);
            //		student.study();
            //		Car car = applicationContext.getBean(Car.class );
            //		System.out.println(car);
            Father father=applicationContext.getBean("father",Father.class);
            father.useStudent();
//            HomeController homeController=applicationContext.getBean(HomeController.class);
//            homeController.loginUser();
//            homeController.logout();

//            Car bean1 = applicationContext.getBean(Car.class);
//            Car bean2= applicationContext.getBean(Car.class);
//            Car bean3 = applicationContext.getBean(Car.class);
//            System.out.println(bean1);
//            System.out.println(bean2);
//            System.out.println(bean3);
        }

    }

