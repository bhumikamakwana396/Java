package com.base;

class Circle2
{
	final double PI=3.14;//final variable
	
	void displayArea(int radius)
	{
		System.out.println("Area of circle is : "+(PI*radius*radius));
	}
}
public class Ass31
{
	public static void main(String[] args)
	{
		Circle2 c1=new Circle2();
		c1.displayArea(2);
	}
}
