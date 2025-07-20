package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ass78 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many numbers are enterd: ");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			numbers.add(num);
		}
		System.out.println("Original List: "+numbers);
		
		Collections.sort(numbers);
		System.out.println("After Ascending Order: "+numbers);
		
		Collections.sort(numbers.reversed());
		System.out.println("After Descending Order: "+numbers);
		sc.close();
		
	}
}
