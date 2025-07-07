package com.base;

interface Flyble
{
	void fly();
}

interface Swimmble
{
	void swim();
}

class Bird implements Flyble,Swimmble
{

	@Override
	public void swim() {
		System.out.println("Birs is swimming in the water");
	}

	@Override
	public void fly() {
		System.out.println("Bird is flying in the sky");
	}
	
}
public class Ass48 
{
	public static void main(String[] args) 
	{
		Bird b1=new Bird();
		b1.fly();
		b1.swim();
	}
}
