package com.base;

interface If1
{
	void Math1();
}
interface If2
{
	void Math2();
}
interface If3
{
	void Math3();
}
interface If4
{
	void Math4();
}
public class InterfaceDemo implements If1,If2,If3,If4
{
	int a=10,b=20;
	public void Math1()
	{
		System.out.println("Addition: "+(a+b));
	}
	public void Math2()
	{
		System.out.println("Substraction: "+(a-b));
	}
	public void Math3()
	{
		System.out.println("Multiplication: "+(a*b));
	}
	public void Math4()
	{
		System.out.println("Division: "+(a/b));
	}
	public static void main(String[] args) 
	{
		InterfaceDemo i=new InterfaceDemo();
		i.Math1();
		i.Math2();
		i.Math3();
		i.Math4();
	}
}
