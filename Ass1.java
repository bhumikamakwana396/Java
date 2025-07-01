package com.base;

import java.util.Scanner;

public class Ass1 {
	public static void main(String[] args) 
	{
		byte id;
		int age;
		long mobile_number;
		String name;
		char grad='A';
		float height;
		boolean opetion;
		short weight;
		double percantage;
		
		
		Scanner  sc =new Scanner(System.in);
		
		System.out.print("Enter ID: ");
		id=sc.nextByte();
		System.out.print("Enter Name: ");
		name=sc.next();
		System.out.print("Enter Age: ");
		age=sc.nextInt();
		System.out.print("Enter Mobile Number");
		mobile_number=sc.nextLong();
		System.out.print("Enter Height: ");
		height=sc.nextFloat();
		System.out.print("Enter Weight: ");
		weight=sc.nextShort();
		System.out.print("Enter Percantage: ");
		percantage=sc.nextDouble();
		System.out.print("You Want to Current Job in Tops true & false: ");
		opetion=sc.nextBoolean();
		
		
		System.out.println("**************Display Student Information************************");
		
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobile_number);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("Percantage: "+percantage);
		System.out.println("Grad: "+grad);
		System.out.println("Your Ans: "+opetion);
		
		sc.close();
		
		
	}

}
