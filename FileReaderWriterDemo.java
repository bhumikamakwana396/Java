package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter f1=new FileWriter("tops2.txt");
		String s1="Hello Everyone welcome to tops2.txt file";
		
		f1.write(s1);
		f1.flush();
		f1.close();
		System.out.println("Write the content in tops2.txt");
		
		FileReader f2=new FileReader("tops2.txt");
		int i;
		
		while((i=f2.read())!=-1)
		{
			System.out.print((char)i);
		}
		f2.close();
		
	}
}
