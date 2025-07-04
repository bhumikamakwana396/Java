package com.base;

class Vehicle
{
	
	Vehicle(String v)
	{
		
		System.out.println("Vehicle Type : "+v);
	}
}

class Car extends Vehicle
{
	String model;
	Car()
	{
		this("Car","Tesla");
	}
	Car(String v,String m)
	{
		super(v);
		System.out.println("Car Model : "+m);
	}
}

public class Ass12 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
	}
}
