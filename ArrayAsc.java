package com.base;

import java.util.Scanner;

public class ArrayAsc 
{
	public static void main(String[] args) 
	{
		int i,j;
		int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		System.out.println();
		
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" elements : ");
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Array Elements Is ");
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		System.out.println("Array Ascending Order Elements Is ");
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
	}


}
