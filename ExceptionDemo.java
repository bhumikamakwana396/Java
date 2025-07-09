package com.Exception;

import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args) {
		System.out.println("Start Code");
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter A: ");
			a=sc.nextInt();
			System.out.print("Enter B: ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught"+e);
		}
		
		System.out.println("End code");
		sc.close();
	}
}
