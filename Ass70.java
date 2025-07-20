package com.thread;

class Sensor extends Thread
{
	private String sensorType;
	
	public Sensor(String sensorType)
	{
		this.sensorType=sensorType;
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				double reading=Math.random()*100;
				System.out.println(sensorType+" Sensor Reading "+i+": "+String.format("%.2f", reading));
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println(sensorType +" Sensor interrupted");
		}
	}
}
public class Ass70 
{
	public static void main(String[] args) 
	{
		Sensor temperatureSensor=new Sensor("Temperature");
		Sensor humiditySensor=new Sensor("Humidity");
		
		Thread t1=new Thread(temperatureSensor);
		Thread t2=new Thread(humiditySensor);
		
		try
		{
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			
		}
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
