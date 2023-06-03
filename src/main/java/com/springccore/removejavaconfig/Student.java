package com.springccore.removejavaconfig;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
   private Snak snak;
    
   public Student(Snak snak)
   {
	   super();
	   this.snak = snak;
   }
   
	public Snak getSnak() {
	return snak;
}

public void setSnak(Snak snak) {
	this.snak = snak;
}

	public void study()
    {
		this.snak.eat();
    	System.out.println("Student is study");
    }
}
