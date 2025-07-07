package com.base;

public class StaticMethod 
{
	{
		System.out.println("Bolck 2");
	}
	static int a=10;
	static int b;
	
	static void math(int x)
	{
		System.out.println("X = "+x);
		System.out.println("A = "+a);	
	}
	
	static
	{
		System.out.println("Static Block Intialized");
		b=a*4;
		System.out.println("B = "+b);
	}
	
	{
		System.out.println("Block 1");
	}
	StaticMethod()
	{
		System.out.println("StaticMethod Constructor");
	}
	public static void main(String[] args) 
	{
		math(12);
		StaticMethod s=new StaticMethod();
	}
}
