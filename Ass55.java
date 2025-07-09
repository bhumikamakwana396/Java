package com.Exception;

class TicketLimitExceededException extends Exception
{
	public TicketLimitExceededException(String message)
	{
		super(message);
	}
}

class MovieTicket
{
	void bookTickets(int numberOfTickets)
	{
		try
		{
			if(numberOfTickets>6)
			{
				throw new TicketLimitExceededException("You cannot book more than 6 tickets in one transaction");
			}
			else
			{
				System.out.println("Successfully Booked "+numberOfTickets+" ticket(s).Enjoy your movie!");
			}
		}
		catch(TicketLimitExceededException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Ass55 
{
	public static void main(String[] args) 
	{
		MovieTicket m=new MovieTicket();
		m.bookTickets(7);
		m.bookTickets(5);
		
	}
}
