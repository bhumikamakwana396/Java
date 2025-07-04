package com.base;

class Student1
{
	void display(String name)
	{
		System.out.println("Name: "+name);
	}
	
	void display(String name,int age)
	{
		System.out.println("Name: "+name+", Age: "+age);
	}
	
	void display(String name,int age,String grade)
	{
		System.out.println("Name: "+name+", Age: "+age+", Grade: "+grade);
	}
}
public class Ass18 
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1();
		s1.display("Jaymika");
		s1.display("Jaymika", 26);
		s1.display("Jaymika", 26,"A");
	}
}
