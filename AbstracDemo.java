package com.base;

abstract class Abs1
{
	int a=10,b=20;
	void math1()
	{
		System.out.println("Addition: "+(a+b));
	}
	abstract void math2();
}

class Abs2 extends Abs1
{
	void math2() 
	{
		System.out.println("Substraction: "+(a-b));
	}
	
}
public class AbstracDemo 
{
	public static void main(String[] args) 
	{
		Abs2 a=new Abs2();
		a.math1();
		a.math2();
	}
}
