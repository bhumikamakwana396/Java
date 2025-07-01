package com.base;

public class Pattern5 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		
		for(i=5;i>=0;i--)
		{
			for(k=0;k<5-i;k++) 
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
