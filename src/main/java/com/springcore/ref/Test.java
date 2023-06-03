package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refcongif.xml");
		A obj = (A)context.getBean("aref");
		
		System.out.println(obj);
		System.out.println(obj.getX()+"  "+obj.getObj() + "   " + obj.getObj().getY());

	}

}
