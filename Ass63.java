package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ass63 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream f1=new FileOutputStream("input.txt");
		String s="This is input.txt file,welcome to all of you";
		byte b[]=s.getBytes();
		
		f1.write(b);
		f1.flush();
		
		FileInputStream f2=new FileInputStream("input.txt");
		
		int i;
		while((i=f2.read())!=-1)
		{
			System.out.print((char)i);
		}
		f2.close();
		f1.close();
		
		
		
	}
}
