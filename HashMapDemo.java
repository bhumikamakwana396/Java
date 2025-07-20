package com.file;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Bhumika");
		hm.put(456, "Daxa");
		hm.put(345, "Priya");
		hm.put(897, "Jaymika");	
		
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(hm.entrySet());
		System.out.println(hm.isEmpty());
		System.out.println(hm.get("Bhumika"));
		System.out.println(hm.get(897));
	}
}
