package com.base;

public class Ass33 
{
	static int x=100;
	int y=50;
	
	static void showX()
	{
		System.out.println("Static X: "+x);
	}
	
	void showY()
	{
		System.out.println("Not static Y: "+y);
		System.out.println("Accessing static x inside non-static: "+x);
	}
	public static void main(String[] args) 
	{
		Ass33 a=new Ass33();
		
		showX();
		a.showY();
	}
}
