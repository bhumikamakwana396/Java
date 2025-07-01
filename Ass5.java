package com.base;

import java.util.Scanner;

public class Ass5 
{
	public static void main(String[] args) 
	{
		int num,reverse=0,remainder,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		num=sc.nextInt();
		
		temp=num;
		
		while(num>0)
		{
			remainder=num%10;
			reverse=remainder+(reverse*10);
			num=num/10;
		}
		
		if(reverse==temp)
		{
			System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("Number is not Palindrom");
		}
		sc.close();
	}

}
