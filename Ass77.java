package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ass77 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Anjali");
        names.add("Bharti");
        names.add("Chirag");
        names.add("Dali");
        names.add("Eva");
        
        System.out.println(names);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name to new : ");
        String newName=sc.next();
        
        if(names.size()>=3)
        {
        	names.set(2, newName);
        	System.out.println("Updated Name: "+names);
        }
        else
        {
        	System.out.println("List not have 3 element");
        }
        sc.close();
       
      
	}
}
