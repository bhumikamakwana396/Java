package com.thread;

class Even extends Thread
{
	int n;
	Even(int n)
	{
		this.n=n;
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even: "+i);
				try
				{
					Thread.sleep(500);
				}catch (InterruptedException e) {
					e.getMessage();
				}
			}
		}
	}
}

class Odd extends Thread
{
	int n;
	Odd(int n)
	{
		this.n=n;
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd: "+i);
				try
				{
					Thread.sleep(500);
				}catch (InterruptedException e) {
					e.getMessage();
				}
			}
		}
	}
}
public class Ass67 
{
	public static void main(String[] args)
	{
		Even t1=new Even(5);
		Odd o1=new Odd(5);
		try
		{
			t1.start();
			t1.join();
			o1.start();
			o1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
