package com.base;

import java.util.Scanner;

public class variable 
{
		public static void main(String[] args) 
		{
			double a,b,c;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter A: ");
			a=sc.nextDouble();
			System.out.print("Enter B: ");
			b=sc.nextDouble();
			
			c=a+b;
			System.out .println("Addition: "+c);
			c=a-b;
			System.out .println("Substraction: "+c);
			c=a*b;
			System.out .println("Multiplication: "+c);
			c=a/b;
			System.out .println("Division: "+c);
			
			sc.close();
			
		}
	

}
