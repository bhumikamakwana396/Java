package com.base;

import java.util.Scanner;

public class SwithCase 
{
	public static void main(String[] args) {
		int a,b,ans,choice=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****************************");
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		System.out.println("****************************");
		
		System.out.println("1. Addition");
		System.out.println("2.Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("****************************");
		
		System.out.print("Enter Your Choice : ");
		choice=sc.nextInt();
		System.out.println("****************************");
		
		switch(choice)
		{
			case 1:
				ans=a+b;
				System.out.println("Addition : "+ans);
				break;
			case 2:
				ans=a-b;
				System.out.println("Substraction : "+ans);
				break;
			case 3:
				ans=a*b;
				System.out.println("Multiplication : "+ans);
				break;
			case 4:
				ans=a/b;
				System.out.println("Division : "+ans);
				break;
			default:
				
				System.out.println("Invalid Choice");
				break;
		}
		sc.close();
	}

}
