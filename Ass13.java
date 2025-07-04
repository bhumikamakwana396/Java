package com.base;

class Employee
{
	String n;
	double s;
	Employee()
	{
		this("Default",10000);
	}
	Employee(String n)
	{
		this(n,10000);
	}
	Employee(String n,double s)
	{
		this.s=s;
		this.n=n;
		System.out.println("Employee Created: Name= "+n+", Salary="+s);
	}
}

public class Ass13 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee("Alice");
		Employee e3=new Employee("Bob",50000);
	}

}
