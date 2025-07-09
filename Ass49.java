package com.Exception;

import java.util.Scanner;

public class Ass49 
{
	public static void ageCheck()
	{
		int age;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Age: ");
			age=sc.nextInt();
			if(age>18)
			{
				System.out.println("Age: "+age);
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println("Age not valid for voting");
			ageCheck();
		}
	}
	
	public static void main(String[] args) 
	{
		ageCheck();
	}
}
