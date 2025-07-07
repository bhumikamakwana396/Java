package com.base;

final class Vehicle2
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

/*class Bike extends Vehicle2//error cannot inherit final class into subclass
{
	
}*/
public class Ass27 
{
	public static void main(String[] args) 
	{
		Vehicle2 v=new Vehicle2();
		v.run();
				
	}
}
