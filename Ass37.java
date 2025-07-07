package com.base;

class Calculator1
{
	int a,b;
	
	Calculator1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("Addition: "+(a+b));
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
	}
	void show()
	{
		this.display();
		System.out.println("This is show() method");
	}
}
public class Ass37 
{
	public static void main(String[] args) 
	{
		Calculator1 c1=new Calculator1(20,10);
		c1.show();
	}
}
