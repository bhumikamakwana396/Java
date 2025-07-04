package com.base;

class Vehicle1
{
	void speed()
	{
		System.out.println("Vehicle speed");
	}
}
class Bike extends Vehicle1
{
	void speed()
	{
		System.out.println("Bike Speed: 80 km/h");
	}
}
class Car1 extends Vehicle1
{
	void speed()
	{
		System.out.println("Car Speed: 150 km/h");
	}
}

class Truck extends Vehicle1
{
	void speed()
	{
		System.out.println("Truck Speed: 60 km/h");
	}
}
public class Ass24 
{
	public static void main(String[] args)
	{
		Bike b1=new Bike();
		Car1 c1=new Car1();
		Truck t1=new Truck();
		
		b1.speed();
		c1.speed();
		t1.speed();
	}
}
