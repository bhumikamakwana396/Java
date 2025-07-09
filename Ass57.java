package com.Exception;

class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String message)
	{
		super(message);
	}
}

class PasswordCheck
{
	void validatePassword(String password)
	{
		try
		{
			if(password.length()!=6)
			{
				throw new InvalidPasswordException("Password too short");
			}
			else
			{
				System.out.println("Password: "+password);
			}
		}
		catch(InvalidPasswordException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Ass57 
{
	public static void main(String[] args) 
	{
		PasswordCheck p=new PasswordCheck();
		
		p.validatePassword("Mbhumika@0105");
		p.validatePassword("bmk@15");
	}
}
