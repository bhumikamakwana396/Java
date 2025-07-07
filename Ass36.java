package com.base;

class Car2
{
	String cname,model;
	Car2()
	{
		this("Toyota","Corolla");
	}
	Car2(String cname,String model)
	{
		
		this.cname=cname;
		this.model=model;
	}
	
	void display()
	{
		System.out.println("Car Brand: "+cname);
		System.out.println("Car Model: "+model);
	}
}
public class Ass36 
{
	public static void main(String[] args) {
		Car2 c=new Car2();
		c.display();
		
		Car2 c1=new Car2("Honda","Civic");
		c1.display();
	}
}
