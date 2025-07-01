package com.base;

public class JumpingStatements 
{
	public static void main(String[] args) {
		int i;
		
		for(i=0;i<10;i++)
		{
			if(i==5 || i==8)
			{
				continue;
			}
			else if(i==9)
			{
				break;
			}
			else
			{
				System.out.println("I : "+i);
			}
		}
	}

}
