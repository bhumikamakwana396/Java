package com.base;

class Student3
{
	int rno;
	String sname;
	
	Student3()
	{
		System.out.println("Default Constructor");
		rno=2;
		sname="Bhumika";
	}
	Student3(int rno,String sname)
	{
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
	void show()
	{
		System.out.println("Roll No: "+rno);
		System.out.println("Student Name: "+sname);
		
	}
}
public class ThisKeyword 
{
	public static void main(String[] args) {
		
		Student3 s1=new Student3(1,"Daxa");
		s1.show();
	}
}
