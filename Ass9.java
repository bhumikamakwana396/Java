package com.base;

import java.util.Scanner;

class Sum//Multilevel Inheritance
{
	int a,b;
	
	void getValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void calSum()
	{
		System.out.println("Addition : "+(a+b));
	}
}
class Sub extends Sum
{
	void calSub()
	{
		System.out.println("Substraction : "+(a-b));
	}
}
class Mul extends Sub
{
	void calMul()
	{
		System.out.println("Multiplication : "+(a*b));
	}
}
public class Ass9 
{
	public static void main(String[] args)
	{
		Mul m1=new Mul();
		m1.getValue();
		
		m1.calSum();
		m1.calSub();
		m1.calMul();
		
	}

}
