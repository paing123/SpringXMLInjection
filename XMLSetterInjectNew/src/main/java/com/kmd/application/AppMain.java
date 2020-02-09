package com.kmd.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kmd.repository.Application;

public class AppMain {
    public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details : "+application);
    }
}