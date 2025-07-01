package com.base;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) {
		int i,sum=0;
		int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" elements : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println("Array Elements Is ");
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
		System.out.println();
		System.out.println("Sum of Values = "+sum);
		sc.close();
	}

}
