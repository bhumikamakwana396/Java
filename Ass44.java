package com.base;

interface Printable
{
	void print();
}
 class Document implements Printable
 {
	@Override
	public void print() 
	{
		System.out.println("Documents Printed");
	} 
 }
 
 class Image implements Printable
 {
	@Override
	public void print() 
	{
		System.out.println("Image Printed");
	} 
 }
public class Ass44 
{
	public static void main(String[] args) 
	{
		Document d1=new Document();
		Image i1=new Image();
		
		d1.print();
		i1.print();
	}
}
