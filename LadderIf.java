package com.base;

import java.util.Scanner;

public class LadderIf 
{
		public static void main(String[] args) 
		{
			int rno,s1,s2,s3,total;
			double per;
			String sname;
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Student Name : ");
			sname=sc.next();
			System.out.print("Enter Rollno : ");
			rno=sc.nextInt();
			System.out.print("Enter Marks of Subject 1 : ");
			s1=sc.nextInt();
			System.out.print("Enter Marks of Subject 2 : ");
			s2=sc.nextInt();
			System.out.print("Enter Marks of Subject 3 : ");
			s3=sc.nextInt();
			
			total=s1+s2+s3;
			per=total/3;
			
			System.out.println("Student Name : "+sname);
			System.out.println("RollNo : "+rno);
			System.out.println("Total Marks : "+total);
			System.out.println("Percantage : "+per);
			if(per>=70)
			{
				System.out.println("Distiction");
			}
			else if(per>=60)
			{
				System.out.println("First Class");
			}
			else if(per>=50)
			{
				System.out.println("Second Class");
			}
			else if(per>=40)
			{
				System.out.println("Pass Class");
			}
			else
			{
				System.out.println("Fail Class");
			}
				
				
				
			sc.close();
			
		}

}
