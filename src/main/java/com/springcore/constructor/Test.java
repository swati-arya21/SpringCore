package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/ci.xml");
		Person obj = (Person)context.getBean("person");
		System.out.println(obj);
		
		Addition obj2= (Addition)context.getBean("addition");
		obj2.doSum();

	}

}
