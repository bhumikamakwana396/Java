package com.base;

class Student
{
	String name,course;
	int marks;
	
	Student()
	{
		this("Default","BCA");
	}
	Student(String name,String course)
	{
		this(name,course,75);
	}
	Student(String name,String course,int marks)
	{
		this.name=name;
		this.course=course;
		this.marks=marks;
		System.out.println("Student : "+name+" , Course : "+course+" , Marks : "+marks);
	}
}
public class Ass14 
{
	public static void main(String[] args) 
	{
		Student s1= new Student();
		Student s2= new Student("Bhumika","B.Tech");
		Student s3= new Student("Daxa","MCA",56);
	}

}
