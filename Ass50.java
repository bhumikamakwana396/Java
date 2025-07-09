package com.Exception;

import java.util.Scanner;

public class Ass50 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the inedex(0 to 4) you want to access : ");
		int index=sc.nextInt();
		
		try
		{
			System.out.println("Value at index "+index+": "+a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error index: "+index+" is out of bound please enter between 0 to 4");
		}
		sc.close();
		
	}
}
