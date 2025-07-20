package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ass75 
{
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Anjali");
        names.add("Bharti");
        names.add("Chirag");
        names.add("Dali");
        names.add("Eva");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String getName=sc.next();
        
        if(names.contains(getName))
        {
        	System.out.println(getName+" is fount in arraylist");
        }
        else
        {
        	System.out.println(getName+" cannot find in arraylist");
        }
        sc.close();
        

	}
}
