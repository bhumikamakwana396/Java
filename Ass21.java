package com.base;

import java.util.Scanner;

class Bank
{
	double r;
	void getInterestRate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bank Interest Rate : ");
		r=sc.nextDouble();
	}
}
class SBI extends Bank
{
	void getInterestRate()
	{
		super.getInterestRate();
		System.out.println("SBI Rate: "+r+"%");
	}
}
class HDFC extends Bank
{
	void getInterestRate()
	{
		super.getInterestRate();
		System.out.println("HDFC Rate: "+r+"%");
	}
}
class ICICI extends Bank
{
	void getInterestRate()
	{
		super.getInterestRate();
		System.out.println("ICICI Rate: "+r+"%");
	}
}
public class Ass21 
{
	public static void main(String[] args) 
	{
		SBI s1=new SBI();
		HDFC h1=new HDFC();
		ICICI i1=new ICICI();
		
		s1.getInterestRate();
		h1.getInterestRate();
		i1.getInterestRate();
	}
}
