package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/standalone/collectionconfig.xml");
		Emp em1 = (Emp) context.getBean("emp1");
		System.out.println(em1);
		System.out.println(em1.getProps());
	}

}
