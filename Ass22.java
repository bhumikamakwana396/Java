package com.base;

class Bank1 
{
 double getInterestRate() 
 {
     return 0.0;
 }
}

class SBI1 extends Bank1 
{
 double getInterestRate()
 {
     return 5.5;
 }
}


class HDFC1 extends Bank1
{ 
 double getInterestRate() 
 {
     return 6.5;
 }
}

//Derived class ICICI
class ICICI1 extends Bank1 
{
 double getInterestRate() 
 {
     return 7.0;
 }
}

public class Ass22 
{
	public static void main(String[] args) 
	{
		     Bank1 b;

		     b = new SBI1();
		     System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

		     b = new HDFC1();
		     System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");

		     b = new ICICI1();
		     System.out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");
		 }
}

