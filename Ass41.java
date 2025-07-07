package com.base;

abstract class Person
{
	abstract void work();
}

class Teacher extends Person
{
	String name;
	Teacher(String name)
	{
		this.name=name;
	}
	void work() 
	{
		System.out.println(name+" is teaching students");
	}
	
}
class Doctor extends Person
{
	String name;
	Doctor(String name)
	{
		this.name=name;
	}
	void work() 
	{
		System.out.println(name+" is treating patients");
	}
	
}
public class Ass41 
{
	public static void main(String[] args) 
	{
		Teacher t1=new Teacher("Mrs. Sharma");
		t1.work();
		Doctor d1=new Doctor("Dr. Jaydeep");
		d1.work();
	}
}
