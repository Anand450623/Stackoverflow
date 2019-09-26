package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.Test;

@SpringBootApplication
public class DemoApplication 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Test test = context.getBean(Test.class);
        System.err.println("The required count is = "+test.getCount());
    }
}