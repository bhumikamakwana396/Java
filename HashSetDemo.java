package com.collection;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(10.10);
		h1.add("tops");
		h1.add("t");
		h1.add(true);
		h1.add(null);
		h1.add(10);
		
		System.out.println(h1);
	
		
	}
}
