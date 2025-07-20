package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rno;
	String sname;
	double per;
	public Student(int rno, String sname, double per) 
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	@Override
	public String toString() 
	{
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}	
}
public class FileSAD 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student s1=new Student(1,"Jaydeep",93.23);
		FileOutputStream f1=new FileOutputStream("sr");
		ObjectOutputStream oo1=new ObjectOutputStream(f1);
		
		oo1.writeObject(s1);
		oo1.close();	
		
		
		FileInputStream f2=new FileInputStream("sr");
		ObjectInputStream oo2=new ObjectInputStream(f2);
		
		Student s2=(Student) oo2.readObject();
		
		System.out.println(s2);
		oo2.close();
		f2.close();
		
		
		
	}
}
