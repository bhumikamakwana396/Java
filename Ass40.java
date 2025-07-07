package com.base;

abstract class Shape1
{
	abstract void area();
}

class Circle3 extends Shape1
{
	static double PI=3.14;
	int r=2;
	void area() 
	{
		System.out.println("Area of circle: "+(PI*r*r));
	}
	
}

class Rectangle1 extends Shape1
{
	int length=5,breadth=4;
	
	@Override
	void area() 
	{
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
	
}
public class Ass40 
{
	public static void main(String[] args) 
	{
		Circle3 c1=new Circle3();
		c1.area();
		Rectangle1 r1=new Rectangle1();
		r1.area();
	}
}
