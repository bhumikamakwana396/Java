package com.base;

class Box1
{
	int length=10;
	int width=5;
	
	Box1 getObject()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}
}
public class Ass38 
{
	public static void main(String[] args) 
	{
		Box1 b1=new Box1();
		Box1 b2=b1.getObject();
		b2.display();
		
	}
}
