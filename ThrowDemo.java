package com.Exception;

import java.util.Scanner;

public class ThrowDemo 
{
	public static void demo()
	{
		int x;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter X: ");
			x=sc.nextInt();
			
			if(x>0)
			{
				System.out.println("Squre of "+x+" is: "+(x*x));
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter positive value only");
			demo();
		}
	}
	public static void main(String[] args) 
	{
		demo();
	}
}
