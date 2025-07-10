package com.Exception;

public class CheckAccount 
{
	int ano;
	String cname;
	double balance;
	public CheckAccount(int ano, String cname, double balance)
	{
		this.ano = ano;
		this.cname = cname;
		this.balance = balance;
		System.out.println("Your Name is "+cname+" and account number is "+ano+" ,inside balance is "+balance+" Rs.");
	}
	
	void deposite(double amount)
	{
		this.balance+=amount;
		System.out.println("Successfully Deposite: "+balance);
	}
	
	void withdraw(double amount) throws InsufficientFundsException1
	{
			if(amount>=balance)
			{
				throw new InsufficientFundsException1("Insufficient balance in withdraw faild");
			}
			
				balance-=amount;
				System.out.println("Withdraw Success: "+balance);
		
	}
	
	void checkBalance()
	{
		System.out.println("Current Balance: "+balance);
	}
}
