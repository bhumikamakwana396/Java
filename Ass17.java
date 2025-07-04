package com.base;

class AreaCalculator
{
	void area(int side)
	{
		System.out.println("Squre area is: "+(side*side));
	}
	void area(int length,int breadth)
	{
		System.out.println("Rectangle area is: "+(length*breadth));
	}
	void area(double radius)
	{
		System.out.println("Circle area is: "+(3.14*radius*radius));
	}
	void area(double base,double height)
	{
		System.out.println("Triangle area is: "+(base*height));
	}
}
public class Ass17 
{
	public static void main(String[] args) {
		AreaCalculator a1=new AreaCalculator();
		a1.area(5);
		a1.area(5, 6);
		a1.area(2.0);
		a1.area(3, 4);
	}

}
