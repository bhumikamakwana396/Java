package com.base;

import java.util.Scanner;

public class StaticVariable 
{
	static int j;
	Scanner sc=new Scanner(System.in);
	
	void getJ()
	{
		System.out.print("Enter J : ");
		j=sc.nextInt();
	}
	void putJ()
	{
		System.out.println("J = "+j);
	}
	public static void main(String[] args) 
	{
		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		StaticVariable s3=new StaticVariable();
		
		s1.getJ();
		s2.getJ();
		s3.getJ();
		
		s1.putJ();
		s2.putJ();
		s3.putJ();
	}
}
