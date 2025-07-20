package com.thread;

class ChatUser implements Runnable
{
	private String name;
	public ChatUser(String name)
	{
		this.name=name;
	}
	@Override
	public  synchronized void run() 
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(name+": Message "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(name+" interrupeted");
			}
		}
	}
	
}
public class Ass71 
{
	public static void main(String[] args) 
	{
		ChatUser c1=new ChatUser("Bhumika");
		ChatUser c2=new ChatUser("Daxa");
		ChatUser c3=new ChatUser("Jaymika");
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		Thread t3=new Thread(c3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
