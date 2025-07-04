package com.base;

class Shape
{
	void draw()
	{
		System.out.println("Shape Class Draw method");
	}
}
class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
}
public class Ass23 
{
	public static void main(String[] args) 
	{
		Circle1 c1=new Circle1();
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		
		c1.draw();
		r1.draw();
		t1.draw();
		
	}
}
