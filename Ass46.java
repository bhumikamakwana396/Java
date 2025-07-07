package com.base;

interface Vehicle3
{
	void start();
}

class Car3 implements Vehicle3
{
	@Override
	public void start() {
		System.out.println("Car start");
	}
}

class Bike3 implements Vehicle3
{
	@Override
	public void start() {
		System.out.println("Bike start");
	}
}
public class Ass46 
{
	public static void main(String[] args) {
		Car3 c1=new Car3();
		Bike3 b1=new Bike3();
		
		c1.start();
		b1.start();
		
	}
}
