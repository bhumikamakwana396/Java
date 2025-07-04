package com.base;

import java.util.Scanner;

class Sum1
{
	int a,b;
	
	Sum1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	
	void calvalue()
	{
		System.out.println("Addition : "+(a+b));
	}
}
class Sub1 extends Sum1
{
	void calvalue()
	{
		super.calvalue();
		System.out.println("Substraction : "+(a-b));
	}
	
}
public class RuntimePolymorphism 
{
	public static void main(String[] args) 
	{
		Sub1 s=new Sub1();
		s.calvalue();
		
	}
}
