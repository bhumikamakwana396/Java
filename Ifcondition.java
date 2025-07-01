package com.base;

import java.util.Scanner;//Package

public class Ifcondition {
	public static void main(String[] args)
	{
		int a,b,c;//Create Variables
		Scanner sc=new Scanner(System.in);//Create Scanner Object
		System.out.print("Enter A: ");//Dynamic Value Intialized
		a=sc.nextInt();
		System.out.print("Enter B: ");
		b=sc.nextInt();
		System.out.print("Enter C: ");
		c=sc.nextInt();
		
		/*If Else Condition*/
		if(a>0)
		{
			System.out.println("A is Positive Number");
		}
		else
		{
			System.out.println("A is Negative Number");
		}
		
		/*If Else Condition*/
		if(a%2==0)
		{
			System.out.println("A is Even Number");
		}
		else
		{
			System.out.println("A is Odd Number");
		}
		
		/*If Else Condition*/
		if(a>b)
		{
			System.out.println("A is Max Number");
		}
		else
		{
			System.out.println("B is Max Number");
		}
		
		/*Nested If Else If*/
		if(a>b)
		{
				if(a>c)
				{
					System.out.println("A is Max Number");
				}
				else
				{
					System.out.println("C is Max Number");	
				}
		}
		else if(b>c)
		{
			System.out.println("B is Max Number");
		}
		else
		{
			System.out.println("C is Max Number");
		}
		sc.close();
	}

}
