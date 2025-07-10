package com.Exception;

import java.util.Scanner;

public class ThrowsDemo 
{
	public static void main(String[] args) 
	{
		CheckAccount c=new CheckAccount(101, "Jaydeep", 1000);
		int amount,choice;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("**************************************");
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. CheckBalance");
			System.out.println("4. Exit");
			System.out.println("**************************************");
			
			System.out.print("Enter your choice: ");
			choice=sc.nextInt();
			System.out.println("**************************************");
			
			if(choice==1)
			{
				System.out.print("Enter amount: ");
				amount=sc.nextInt();
				c.deposite(amount);
				System.out.println("**************************************");
			}
			else if(choice==2)
			{
				System.out.print("Enter amount: ");
				amount=sc.nextInt();
				try
				{
					c.withdraw(amount);
				}
				catch(InsufficientFundsException1 e)
				{
					System.out.println(e.getMessage());
				}
				System.out.println("**************************************");
			}
			else if(choice==3)
			{
				c.checkBalance();
				
			}
			else if(choice==4)
			{
				System.out.println("Thank Your for give services");
				System.out.println("**************************************");
				break;
			}
			else
			{
				System.out.println("Invalid choice");
				System.out.println("**************************************");
			}
		}
	}
}
