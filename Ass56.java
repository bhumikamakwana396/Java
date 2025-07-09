package com.Exception;

class InvalidDepositException extends Exception
{
	public InvalidDepositException(String message)
	{
		super(message);
	}
}

class Deposit
{
	double balance;
	
	Deposit(double balance)
	{
		this.balance=balance;
	}
	
	void deposit(int amount)
	{
		try
		{
			if(amount<0)
			{
				throw new InvalidDepositException("Invalid amount please enter positive amount");
			}
			else
			{
				balance+=amount;
				System.out.println("Final amount : "+balance);
			}
		}
		catch(InvalidDepositException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Ass56 
{
	public static void main(String[] args) 
	{
		Deposit d=new Deposit(12000);
		d.deposit(-2000);
		d.deposit(2000);
	}
}
