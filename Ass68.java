package com.thread;
class A extends Thread
{
	public synchronized void  run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("A ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}

class B extends Thread
{
	public synchronized void run()
	{
		for(int i=0;i<10;i++)
		{
		
			System.out.print("B ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}

public class Ass68 
{
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		
		try {
			a1.start();
			a1.join();
			b1.start();
			b1.join();
		} catch (InterruptedException e) {
			e.getMessage();
			// TODO: handle exception
		}
		
	}
}
