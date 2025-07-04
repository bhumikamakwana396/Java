package com.base;

class Employee1
{
	void calculateSalary()
	{
		System.out.println("Employee Salary");
	}
}

class FullTimeEmployee extends Employee1
{
	void calculateSalary()
	{
		System.out.println("Full-Time Salary: 40000");
	}
}
class PartTimeEmployee extends Employee1
{
	void calculateSalary()
	{
		System.out.println("Part-Time Salary: 15000");
	}
}
public class Ass25 
{
	public static void main(String[] args)
	{
		FullTimeEmployee f1=new FullTimeEmployee();
		PartTimeEmployee p1=new PartTimeEmployee();
		
		f1.calculateSalary();
		p1.calculateSalary();
	}
}
