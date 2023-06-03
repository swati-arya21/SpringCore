package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Snaks obj = (Snaks)context.getBean("snak");
		System.out.println(obj);
		context.registerShutdownHook();
		
		SoftDrink s=(SoftDrink)context.getBean("sd");
		System.out.println(s);
		
		AnnotationExample exe = (AnnotationExample) context.getBean("ae");
		System.out.println(exe);
	}

}
