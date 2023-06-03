package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
     private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "AnnotationExample [course=" + course + "]";
	}
    @PostConstruct()
	public void start()
	{
		System.out.println("Init method");
	}
    @PreDestroy
	public void end()
	{
		System.out.println("Destroy method is called");
	}
}
