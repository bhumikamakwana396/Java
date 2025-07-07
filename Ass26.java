package com.base;
class Animal1
{
	final void sound()
	{
		System.out.println("Animal makes sound");
	}
}

class Dog1 extends Animal1
{
	/*void sound()//Error 
	{
		System.out.println("Dog Barks");
	}*/
}
public class Ass26 
{
	public static void main(String[] args) 
	{
		Dog1 d1=new Dog1();
		d1.sound();
	}
}
