package com.base;

public class Ass29 
{
	 static int count=0;//static variable
	
	Ass29()
	{
		count++;
		System.out.println("Count is: "+count);
	}
	static void showCount()//static method
	{
		System.out.println("Total objects created: "+count);
	}
	public static void main(String[] args) 
	{
		new Ass29();
		new Ass29();
		new Ass29();
		
		Ass29.showCount();
		
		
	}

}
