package com.thread;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread: "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
}

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		MyThread  t1=new MyThread();
		t1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread: "+i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
