package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ass76 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Anjali");
        names.add("Bharti");
        names.add("Chirag");
        names.add("Dali");
        names.add("Eva");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name to remove: ");
        String getName=sc.next();
        
        if(names.remove(getName))
        {
        	System.out.println(getName+" its remove in array list");
        }
        else
        {
        	System.out.println(getName+" ite not available in array list");
        }
       
        Iterator<String> itr=names.iterator();
        
        System.out.println("After available Name in ArrayList");
        while(itr.hasNext())
        {
        	 System.out.println(itr.next());
        }
        sc.close();
	}
}
