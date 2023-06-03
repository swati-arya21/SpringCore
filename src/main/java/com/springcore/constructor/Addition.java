package com.springcore.constructor;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("Constructor int int called");
	}
	
	public Addition(double a, double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor double called");
	}
	public Addition(String a, String b)
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constrctor string called");
	}

	public void doSum()
	{
		System.out.println("a="+this.a+" "+"b="+b);
		System.out.println("Sum ="+ " " + (this.a + this.b));
	}
	
	
	
   
	
}
