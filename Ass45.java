package com.base;

interface A1
{
	void methodA1();
}
interface B1
{
	void methodB1();
}
 interface C1 extends A1,B1
 {
	 void methodC1();
 }
public class Ass45 implements A1,B1,C1
{
	@Override
	public void methodC1() {
		System.out.println("Method C1");
	}

	@Override
	public void methodB1() {
		System.out.println("Method B1");
	}

	@Override
	public void methodA1() {
		System.out.println("Methos A1");
	}
	
	public static void main(String[] args) 
	{
		Ass45 a1=new Ass45();
		a1.methodA1();
		a1.methodB1();
		a1.methodC1();
	}
}
