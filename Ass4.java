package com.base;

import java.util.Scanner;

public class Ass4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n,count=0;
		
		System.out.println("Enter N: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("N is Prime Number");
		}
		else
		{
			System.out.println("N is Not Prime Number");
		}
	sc.close();
	}
}
