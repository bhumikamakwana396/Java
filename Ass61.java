package com.Exception;

class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
class ATM
{
	double balance;
	
	public ATM(double balance)
	{
		this.balance=balance;
	}
	
	void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount>=balance)
		{
			throw new InsufficientFundsException("Insufficient balance! your current balance is Rs."+balance);
		}
		else
		{
			balance-=amount;
			System.out.println("Withdrawal of Rs."+amount+" success");
			System.out.println("Final amount is: "+balance);
		}
	}
}
public class Ass61
{
	public static void main(String[] args) 
	{
		ATM a1=new ATM(5000);
		try
		{
			a1.withdraw(6000);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			a1.withdraw(2000);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
