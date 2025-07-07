package com.base;

abstract class BankAccount
{
	double balance;
	BankAccount(double balance)
	{
		this.balance=balance;
	}
	abstract void calculateInterest();
	void showBalance()
	{
		System.out.println("Current balanace: "+balance);
	}	
}

class SavingsAccount extends BankAccount
{
	SavingsAccount(double balance)
	{
		super(balance);
	}
	@Override
	void calculateInterest() 
	{
		System.out.println("Saving Account Interest: Rs."+(balance*0.04));
	}
}

class CurrentAccount extends BankAccount
{
	CurrentAccount(double balance)
	{
		super(balance);
	}
	@Override
	void calculateInterest() 
	{
		System.out.println("Current Account No Interest");
	}
}
public class Ass43
{
	public static void main(String[] args) 
	{
		SavingsAccount s1=new SavingsAccount(10000);
		CurrentAccount c1=new CurrentAccount(20000);
		
		s1.showBalance();
		c1.showBalance();
		s1.calculateInterest();
		c1.calculateInterest();
	}
}
