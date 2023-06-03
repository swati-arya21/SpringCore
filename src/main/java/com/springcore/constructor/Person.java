package com.springcore.constructor;

public class Person {
	
	private String pname;
	private int personId;
	private Certificate certi;
	public Person(String pname, int personId, Certificate certi) {
		super();
		this.pname = pname;
		this.personId = personId;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", personId=" + personId +",Certificate="+ certi +"]";
	}
	
	

}
