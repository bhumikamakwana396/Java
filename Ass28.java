package com.base;

final class University
{
	final String universityName="MKBU";
	
	final void showUniversity()
	{
		System.out.println("University: "+universityName);
	}
}

class Department
{
	void showDept(final String deptName)
	{
		System.out.println("Department: "+deptName);
	}
	
	void showStudentDetails()
	{
		final Student4 s=new Student4("Bhumika");
		System.out.println("Student name: "+s.name);
	}
}

class Student4
{
	String name;
	
	Student4(String name)
	{
		this.name=name;
		
	}
}
public class Ass28 
{
	public static void main(String[] args) 
	{
		University u=new University();
		u.showUniversity();
		
		Department d=new Department();
		d.showDept("Computer Science");
		d.showStudentDetails();
		
	}
}
