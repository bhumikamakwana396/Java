package com.base;

import java.util.Scanner;

public class BankInfo 
{
	public static void main(String[] args) 
	{
		int acc_no;
		String aname;
		double balance,amount=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account No : ");
		acc_no=sc.nextInt();
		System.out.print("Enter Account Holder Name : ");
		aname=sc.next();
		System.out.print("Enter Balance : ");
		balance=sc.nextDouble();
		
		System.out.println();
		
		if(balance>0)
		{
			System.out.print("Enter Amount : ");
			amount=sc.nextDouble();
			balance+=amount;
			System.out.println("Successfully Deposite");
			System.out.println("Deposite Amount : "+balance);
		}
		
		if(amount<balance)
		{
			System.out.print("Enter Amount : ");
			amount=sc.nextDouble();
			balance-=amount;
			System.out.println("Successfully Withdraw");
			System.out.println("Withsraw Amount : "+balance);
		}
		
		System.out.println();
		System.out.println("**************Transaction Details****************");
		System.out.println("Account Number : "+acc_no);
		System.out.println("Account Holder Name : "+aname);
		System.out.println("Deposite Final Amount : "+balance);
		sc.close();
	}

}
