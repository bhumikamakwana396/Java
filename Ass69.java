package com.thread;

import java.util.Scanner;

class TicketBooking extends Thread
{
	private int availableTicket=5;
	
	public synchronized void bookTicket(String uname,int numOfTickets)
	{
		if(numOfTickets<=availableTicket)
		{
			System.out.println(uname+" booked "+numOfTickets+" ticket successfully.");
			availableTicket-=numOfTickets;
			System.out.println("Remain tickets :"+availableTicket);
		}
		else
		{
			System.out.println(uname+" failed to book.no book tickets available");
		}
	}
	
	public void run()
	{
		String uname=Thread.currentThread().getName();
		int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how many tickets book: ");
			n=sc.nextInt();
			bookTicket(uname,n);
			sc.close();
			
	}
}
public class Ass69 
{
	public static void main(String[] args) 
	{
		TicketBooking t1=new TicketBooking();
		
		Thread u1=new Thread(t1);
		Thread u2=new Thread(t1);
		Thread u3=new Thread(t1);
		
		u1.setName("User A");
		u2.setName("User B");
		u3.setName("User C");
		
		try
		{
			u1.start();
			u2.start();
			u3.start();
			
			u1.join();
			u2.join();
			u3.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
