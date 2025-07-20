package com.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ass64 
{
	public static void main(String[] args) throws IOException 
	{	
		String name;
		int age;
		FileWriter f1=new FileWriter("user.txt");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter User name: ");
		name=sc.next();
		System.out.print("Enter Age: ");
		age=sc.nextInt();
		
		f1.write("Name: "+name+" ");
		f1.write("Age: "+age);
		f1.flush();
		f1.close();
		sc.close();
	}
}
