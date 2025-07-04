package com.base;

class Book
{
	
	Book()
	{
		System.out.println("Book Created");
	}
	Book(String t )
	{
		this();
		System.out.println("Title : "+(t));
	}
	Book(String t,String A )
	{
		this(t);
		System.out.println("Title : "+t+ " | Author : "+ A);
	}
}
public class Ass11 
{
	public static void main(String[] args) 
	{
		Book b3 = new Book("Java Basics","John Smith");
	}
}
