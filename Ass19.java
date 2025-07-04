package com.base;

class VolumeCalculator
{
	void volume(int side)
	{
		System.out.println("Volume of Cube: "+(side*side*side));
	}
	void volume(int radius,int height)
	{
		System.out.println("Volume of Cylinder: "+(3.14*radius*radius*height));
	}
	void volume(double length,double breadth,double height)
	{
		System.out.println("Volume of Cuboid: "+(length*breadth*height));
	}
}
public class Ass19 
{
	public static void main(String[] args) 
	{
		VolumeCalculator v1=new VolumeCalculator();
		
		v1.volume(4);
		v1.volume(4, 7);
		v1.volume(10, 20, 30);
	}
}
