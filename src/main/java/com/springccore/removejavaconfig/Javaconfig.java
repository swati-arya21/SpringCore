package com.springccore.removejavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.removejavaconfig")
public class Javaconfig {
	@Bean
	public Snak getSnak()
	{
		return new Snak();
	}
	//@Bean(name={"student","temp","con"})
	@Bean
	public Student getStudent()
	{
		Student student = new Student(getSnak());
		return student;
	}

}
