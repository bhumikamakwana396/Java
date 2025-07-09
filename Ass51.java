package com.Exception;

public class Ass51 
{
	public static void main(String[] args) 
	{
		try
		{
			String str="jaymika";
			System.out.println("Outer try blocke started");
			
			try
			{
				System.out.println("Inner try blocke started");
				int result=10/5;
				System.out.println("Result: "+result);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Caught ArthmeticException: "+ae);
			}
			System.out.println("Legth of string: "+str.length());
		}
		catch(NullPointerException ne)
		{
			System.out.println("Caugth Nullpointer: "+ne);
		}
		System.out.println("Program continue after exception handling");
	}
}
