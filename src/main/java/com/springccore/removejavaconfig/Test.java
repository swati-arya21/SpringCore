package com.springccore.removejavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
     public static void main(String args[])
     {
    	 //ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/removejavaconfig/Javaconfig.java");
    	 ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
    	 Student stud=context.getBean("getStudent", Student.class); 
    	 System.out.println(stud);
    	 stud.study();
    	
     }
}
