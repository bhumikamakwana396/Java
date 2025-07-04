package com.base;

class Animal
{
	void sound()
	{
		System.out.println("Animal sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog barks");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Cat meows");
	}
}

class Cow extends Animal
{
	void sound()
	{
		System.out.println("Cow moos");
	}
}
public class Ass20 
{
	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		Cat c1=new Cat();
		Cow c2=new Cow();
		
		d1.sound();
		c1.sound();
		c2.sound();
	}
}
