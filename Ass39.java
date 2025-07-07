package com.base;

import java.util.Scanner;

class Company
{
	void displayEmp(Employee2 e1)
	{

		System.out.println("Employee ID: "+e1.id);
		System.out.println("Employee Name: "+e1.name);
		System.out.println("Employee Salary: "+e1.salary);
	}
}
class Employee2
{
	int id;
	String name;
	double salary;
	
	Scanner sc=new Scanner(System.in);
	
	void getData()
	{
		System.out.print("Enter Employee Id: ");
		id=sc.nextInt();
		System.out.print("Enter Employee Name: ");
		name=sc.next();
		System.out.print("Enter Employee Salary: ");
		salary=sc.nextDouble();
	}
	
	void sendToCopany(Company company)
	{
		company.displayEmp(this);
	}
}

public class Ass39 
{
	public static void main(String[] args) 
	{
		Employee2 e1=new Employee2();
		e1.getData();
		Company c1=new Company();
		e1.sendToCopany(c1);
		
	}
}
