package com.base;


class Circle//Constructor Overloading
{
	double PI=3.14;
	int r;
	
	Circle()
	{
		System.out.println("Default Constructor");
		r=2;
	}
	Circle(int radius)
	{
		System.out.println("Parameterized Constructor");
		r=radius;
	}
	Circle(Circle c)
	{
		System.out.println("Copy Constructor");
		r=c.r;
	}
	void volume()
	{
		System.out.println("Area of circle is : "+(r*r*PI));
	}
}
public class Ass8 
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.volume();
		
		Circle c2=new Circle(3);
		c2.volume();
		
		Circle c3=new Circle(c2);
		c3.volume();
		
		
	}

}
