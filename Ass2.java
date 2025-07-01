package com.base;

import java.util.Scanner;

public class Ass2
{
	public static void main(String[] args)
	{
		int a,b,ans;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		a=sc.nextInt();
		System.out.println("Enter B: ");
		b=sc.nextInt();
		
		if(a>=0 && b>=0)
		{
			ans=a+b;
			System.out.println("Addition: "+ans);
			
			ans=a-b;
			System.out.println("Substraction: "+ans);
			
			ans=a*b;
			System.out.println("Multiplication: "+ans);
		}
		else
		{
			System.out.println("Please enter values grater than 0");
		}
		
		if(b!=0)
		{
			ans=a/b;
			System.out.println("Division: "+ans);
			
			ans=a%b;
			System.out.println("Modulo Division: "+ans);
		}
		else
		{
			System.out.println("Divided by zero error");
		}
		sc.close();
		
	}
}
