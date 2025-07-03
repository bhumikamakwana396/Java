package com.base;

import java.util.Scanner;

class Addition//Single Inheritance
{
	int a,b;
	
	void getValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
	}
	void calsum()
	{
		System.out.println("Addition : "+(a+b));
	}
}
class Subtraction extends Addition
{
	void calSub()
	{
		System.out.println("Substraction : "+(a-b));
	}
}
public class Ass10
{
	public static void main(String[] args)
	{
		Subtraction s1=new Subtraction();
		s1.getValue();
		
		s1.calsum();
		s1.calSub();
		
	}

}
