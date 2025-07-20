package com.collection;



import java.util.ArrayList;
import java.util.Scanner;

public class Ass79 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		ArrayList<Integer> EvenNumber=new ArrayList<Integer>();
		ArrayList<Integer> OddNumber=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many numbers are enterd: ");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			numbers.add(num);
			
			if(i%2==0)
			{
				EvenNumber.add(i);
			}
			else
			{
				OddNumber.add(i);
			}
		}
		
		System.out.println("Original List: "+numbers);
		System.out.println("Even Number List: "+EvenNumber);
		System.out.println("Odd Number List: "+OddNumber);
		
		sc.close();
	}
}
