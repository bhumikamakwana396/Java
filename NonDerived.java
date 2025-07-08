package com.p1;

public class NonDerived 
{
	Protection p=new Protection();
	public NonDerived() {
		System.out.println("NonDerived Default constructor");
		System.out.println("n: "+p.n);
		System.out.println("n_pub: "+p.n_pub);
		System.out.println("n_pro: "+p.n_pro);
		//System.out.println("n_pri: "+p.n_pri);
	}
	
	
}
