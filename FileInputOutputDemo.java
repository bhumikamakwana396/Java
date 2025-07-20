package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream f1=new FileOutputStream("tops1.txt");
		String s1="Hello file tops1.txt";
		byte b[]=s1.getBytes();
		f1.write(b);
		f1.flush();
		f1.close();
		System.out.println("Successfully write file");
		
		FileInputStream f2=new FileInputStream("tops1.txt");
		int i;
		
		while((i=f2.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		f2.close();
	}
	
}
