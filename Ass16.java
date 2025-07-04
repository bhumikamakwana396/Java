package com.base;

class Calculator
{
	
	void add(int a,int b)
	{
		System.out.println("Sum of integers: "+(a+b));
	}
	
	void add(double a,double b)
	{
		System.out.println("Sum of doubles: "+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Sum of three integers: "+(a+b+c));
	}
	
	void add(String a,String b)
	{
		System.out.println("Concatenated strings: "+(a+b));
	}
}
public class Ass16 
{
	public static void main(String[] args)
	{
		Calculator c1=new Calculator();
		
		c1.add(10,20);
		c1.add(10.2, 20.2);
		c1.add(10, 30, 20);
		c1.add("Jay", "mika");
	}

}
