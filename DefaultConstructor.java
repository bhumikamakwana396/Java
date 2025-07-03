package com.base;

class Box
{
	double width,depth,height;
	
	Box()//Default Constructor
	{
		System.out.println("Default Contsructor");
		width=3;
		depth=5;
		height=4;
	}
	Box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor Called");
		width=w;
		depth=d;
		height=h;
	}
	Box(Box b)
	{
		System.out.println("Copy Constructor Called");
		width=b.width;
		depth=b.depth;
		height=b.height;
	}
	void volume()
	{
		System.out.println("Volume Is : "+(width*height*depth));
	}
}
public class DefaultConstructor 
{
	public static void main(String[] args) 
	{
		Box b1=new Box();
		b1.volume();
		
		Box b2=new Box(4,5,6);
		b2.volume();
		
		Box b3=new Box(b2);
		b3.volume();
	}

}
