package com.base;

class A2
{
	A2()
	{
		System.out.println("A2 is Default Constructor");
	}
	void show()
	{
		System.out.println("Show from A2");
	}
	
}

class B2 extends A2
{
	B2()
	{
		System.out.println("B2 is Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show from B2");
	}
}
class C2 extends B2
{
	C2()
	{
		System.out.println("C2 is Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show from C2");
	}
}
public class ConstructorChaining 
{
	public static void main(String[] args) {
		C2 c=new C2();
		c.show();
	}

}
