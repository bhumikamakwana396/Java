package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ass73 
{
	public static void main(String[] args) 
	{
		String filename="data1.txt";
		String content="This is demo file.\nJava File I/O is powerful!";
		try
		{
			FileOutputStream fos=new FileOutputStream(filename);
			
			byte[] s=content.getBytes();
			
			fos.write(s);
			fos.flush();
			fos.close();
			
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			FileInputStream fis=new FileInputStream(filename);
			
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
