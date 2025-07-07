package com.base;

interface Taxable
{
	static double taxRate=0.10;
	double calculateTax();
}

class Employee4 implements Taxable
{
	String name;
	double salary;
	Employee4(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	@Override
	public double calculateTax() {
		return taxRate*salary;
	}
	
	void showDeatil()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Salary is: "+salary);
		System.out.println("Calculate Tax: "+calculateTax());
	}
}
public class Ass47 
{
	public static void main(String[] args) 
	{
		Employee4 e1=new Employee4("Jaydeep",50000);
		e1.showDeatil();
		System.out.println();
		Employee4 e2=new Employee4("Bhumika",75000);
		e2.showDeatil();
	}
}
