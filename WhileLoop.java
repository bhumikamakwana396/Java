package com.base;

import java.util.Scanner;

public class WhileLoop 
{
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		n=sc.nextInt();
		
		while(n>0)//Entry Controll Loop
		{
			sum=sum+n;
			n--;
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}

}
