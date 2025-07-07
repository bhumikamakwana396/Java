package com.base;

public class Ass34 
{
	static int outerData=10;
	
	static class Inner
	{
		void display()
		{
			System.out.println("Accessing outer static data: "+outerData);
		}
	}
	public static void main(String[] args) 
	{
		Ass34.Inner a=new Ass34.Inner();
		a.display();
		
	}
}
