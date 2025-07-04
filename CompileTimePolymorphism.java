package com.base;

public class CompileTimePolymorphism 
{
	int a,b,c;
	void sum() 
	{
		a=2;
		b=2;
		System.out.println("Sum Of without arguments = "+(a+b));
	}
	void sum(int a1,int b1)
	{
		a=a1;
		b=b1;
		System.out.println("Sum Of 2 arguments = "+(a+b));
	}
	void sum(int a1,int b1,int c1)
	{
		a=a1;
		b=b1;
		c=c1;
		System.out.println("Sum of 3 arguments = "+(a+b+c));
	}
	public static void main(String[] args) {
		CompileTimePolymorphism c=new CompileTimePolymorphism();
		c.sum();
		c.sum(10, 20);
		c.sum(10, 20, 30);
	}

}
