package com.Exception;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
class FlightBooking
{
	void checkAge(int age)
	{
		try
		{
			if(age<0 || age>120)
			{
				throw new InvalidAgeException("Not allowed age less than 0 or more than 120");
			}
			else
			{
				System.out.println("Age: "+age);
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Ass58 
{
	public static void main(String[] args) 
	{
		FlightBooking f=new FlightBooking();
		f.checkAge(-12);
		f.checkAge(121);
		f.checkAge(100);
	}
}
