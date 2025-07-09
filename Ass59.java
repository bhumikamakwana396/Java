package com.Exception;

class InvalidAmountException extends Exception
{
	public InvalidAmountException(String message)
	{
		super(message);
	}
}

class MobileRecharge
{
	void recharge(int amount)
	{
		try
		{
			if(amount<10)
			{
				throw new InvalidAmountException("Minimum recharge amount is Rs.10");
			}
			else
			{
				System.out.println("Recharge Successful for Rs."+amount);
			}
		}
		catch(InvalidAmountException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
public class Ass59
{
	public static void main(String[] args) 
	{
		MobileRecharge m=new MobileRecharge();
		m.recharge(9);
		m.recharge(20);
	}
}
