package com.base;

import java.util.Scanner;

public class Ass3 
{
	public static void main(String[] args) 
	{
			int num,remainder,sum=0,temp;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Number : ");
			num=sc.nextInt();
			
			temp=num;
			
			while(num>0)
			{
				remainder=num%10;
				sum=(remainder*remainder*remainder)+sum;
				num=num/10;
			}
			
			if(sum==temp)
			{
				System.out.println("Number is Armstrong");
			}
			else
			{
				System.out.println("Number is not Armstrong");
			}
			
			sc.close();
		
	}

}
