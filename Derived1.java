package com.p2;

import com.p1.Protection;

public class Derived1 extends Protection
{
	public Derived1()
	{
		System.out.println("Derived1 Default constructor");
		//System.out.println("n: "+n);
		System.out.println("n_pub: "+n_pub);
		System.out.println("n_pro: "+n_pro);
		//System.out.println("n_pri: "+n_pri);
	}
}
