package com.file;

import java.io.*;
import java.util.Scanner;

public class Ass65 
{
	public static void main(String[] args) throws IOException 
	{
		String s;
		
		FileWriter f1=new FileWriter("source.txt");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		s=sc.nextLine();
		
		f1.write(s);
		f1.flush();
		f1.close();
		
		System.out.println("Succes write data");
		FileReader f2=new FileReader("source.txt");		
		FileWriter f3=new FileWriter("destination.txt");
		
		int i;
		
		while((i=f2.read())!=-1)
		{
			f3.write(i);
			
		}
		
		System.out.println("Read data source to destination");
		f3.close();
		f2.close();
		sc.close();
	}
}
