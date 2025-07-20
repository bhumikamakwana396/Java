package com.thread;

class ExamTimer implements Runnable
{

	@Override
	public void run() {
		
		for(int i=10;i>=0;i--)
		{
			System.out.println("Time Left: "+i+" seconds");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("Timmer interrupted");
			}
		}
	}
	
}
public class Ass72 
{
	public static void main(String[] args)
	{
		ExamTimer e1=new ExamTimer();
		
		Thread u1=new Thread(e1);
		
		u1.start();
		
		
		
	}
}
