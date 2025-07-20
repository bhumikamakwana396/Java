package com.file;

import java.io.*;
import java.util.Scanner;
public class Ass66
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter f1=new FileWriter("data.txt");
		FileReader f2=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(f2);
		
		String str,line;
		int lc=0,wc=0,cc=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		str=sc.nextLine();
		
		f1.write(str);
		f1.flush();
		
		while((line=br.readLine())!=null)
		{
			lc++;
			cc += line.length();
			String[] words = line.trim().split("\\s+");
			
			if(!line.trim().isEmpty())
			{
				wc+=words.length;
			}			
		}
		
		br.close();
		System.out.println("Lines: "+lc);
		System.out.println("Words: "+wc);
		System.out.println("Character: "+cc);
		f1.close();
		sc.close();
	}
}
