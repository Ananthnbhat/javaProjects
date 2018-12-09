package com.aopExample.aopDemo;

import com.aopExample.aopDemo.services.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation e = (Operation) context.getBean("opBean");
        System.out.println("\ncalling msg...1st method starting with 'm'");
        e.msg();
        System.out.println("calling m...2nd method starting with 'm'");
        e.m();
        System.out.println("calling k...1st method starting with 'k'");
        e.k();
    }
}
