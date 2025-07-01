package com.base;

import java.util.Scanner;

public class NestedForLoop 
{
	public static void main(String[] args) 
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
