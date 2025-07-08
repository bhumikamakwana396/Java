package com.p2;

import com.p1.Protection;

public class NonDerived1
{
	Protection p=new Protection();
	
	public NonDerived1()
	{
		System.out.println("NonDerived1 Default constructor");
		//System.out.println("n: "+p.n);
		System.out.println("n_pub: "+p.n_pub);
		//System.out.println("n_pro: "+p.n_pro);
		//System.out.println("n_pri: "+p.n_pri);
	}
}
