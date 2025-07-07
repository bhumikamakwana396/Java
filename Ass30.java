package com.base;

public class Ass30 
{
	static int a;//static variable
	static int b;
	
	static//static block 1
	{
		a=10;
		b=20;
	}
	static//static block 2
	{
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
	}
}
