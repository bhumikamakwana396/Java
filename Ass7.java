package com.base;

import java.util.Scanner;

public class Ass7
{
	public static void main(String[] args) {
		int i,j;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array A ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Enter "+i+" Row & "+j+" Column : ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Array B ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Enter "+i+" Row & "+j+" Column : ");
				b[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		
		System.out.println("Substraction  Of Array A & B Is");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("  "+c[i][j]);
			}
			System.out.println();
		}
	}

}
