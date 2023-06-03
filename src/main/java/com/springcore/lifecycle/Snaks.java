package com.springcore.lifecycle;

public class Snaks {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Inside setter method");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Snaks [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
    public void destroy()
    {
    	System.out.println("Inside Destroy method");
    }
}
