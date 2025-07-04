package com.base;

class Product
{
	int id,price;
	String name;
	
	Product()
	{
		this(1,"Default");
	}
	Product(int id,String name)
	{
		this(id,name,40000);
	}
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		System.out.println("ID :"+id+" ,Name:"+name+" ,Price:"+price);
	}
}
public class Ass15 
{
	public static void main(String[] args) 
	{
		Product p1=new Product();
		Product p2=new Product(2,"Laptop");
		Product p3=new Product(3,"SmartPhone",12000);
	}
}
