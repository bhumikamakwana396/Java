package com.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Ass74 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Daxa");
		al.add("Bhumika");
		al.add("Sunita");
		al.add("Kiran");
		al.add("Vina");
		
		Iterator<String> itr=al.iterator() ;
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
