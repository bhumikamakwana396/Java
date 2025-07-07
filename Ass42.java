package com.base;

abstract class Animal2
{
	abstract void sound();
}

class Dog2 extends Animal2
{
	@Override
	void sound() {
		System.out.println("Dog Burking");
	}
}

class Cat1 extends Animal2
{
	@Override
	void sound() {
		System.out.println("Cat is Moew");
	}
}

class Cow1 extends Animal2
{
	@Override
	void sound() {
		System.out.println("Cow is Moo ");
	}
}

public class Ass42 
{
	public static void main(String[] args)
	{
		Dog2 d1=new Dog2();
		d1.sound();
		Cat1 c1=new Cat1();
		c1.sound();
		Cow1 c2=new Cow1();
		c2.sound();
	}
}
