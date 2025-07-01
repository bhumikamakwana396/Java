package com.base;

import java.util.Scanner;

public class Ass6 
{
	public static void main(String[] args) 
	{
		int i,first=0,second=1,num,temp=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number : ");
		num=sc.nextInt();
		
		System.out.print(" "+first+" "+second);
		
		for(i=2;i<=num;i++)
		{
			temp=first+second;
			first=second;
			second=temp;
			System.out.print(" "+temp);
		}
		
		sc.close();
	}
	

}
