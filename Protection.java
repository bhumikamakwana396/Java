package com.p1;

public class Protection 
{
	int n=10;
	protected int n_pro=20;
	public int n_pub=30;
	private int n_pri=40;
	
	public Protection()
	{
		System.out.println("Protection Default constructor");
		System.out.println("n: "+n);
		System.out.println("n_pub: "+n_pub);
		System.out.println("n_pro: "+n_pro);
		System.out.println("n_pri: "+n_pri);
	}
}
