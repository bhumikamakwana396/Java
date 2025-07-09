package com.Exception;

class InvalidMarkException extends Exception
{
	public InvalidMarkException(String message)
	{
		super(message);
	}
}

class ResultProcessor
{
	void enterMarks(int marks)
	{
		try
		{
			if(marks<0 || marks>100)
			{
				throw new InvalidMarkException("Invalid Mark,please enter marks between 0 to 100");
			}
			else
			{
				System.out.println("Marks: "+marks);
			}
		}
		catch(InvalidMarkException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Ass54 
{
	public static void main(String[] args) 
	{
		ResultProcessor p=new ResultProcessor();
		p.enterMarks(45);
		p.enterMarks(101);
	}
}
