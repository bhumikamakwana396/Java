package com.base;

 class F1//Final Class
{
	final int a;//Final Variable
	
	public F1()
	{
		a=10;
	}
	 void show()//Final Method
	{
		System.out.println("A = "+a);
	}	
}
 
 class F2 extends F1
 {
	 void show()
	 {
		 super.show();
	 }
 }
public class FinalKeyword 
{
	public static void main(String[] args) 
	{
		F2 f=new F2();
		f.show();
	}
}
