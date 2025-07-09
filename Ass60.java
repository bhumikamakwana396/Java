package com.Exception;

class LateReturnException extends Exception 
{
    public LateReturnException(String message) 
    {
        super(message);
    }
}

class Library 
{
    void returnBook(int daysLate) 
    {
        try 
        {
            if (daysLate > 14) 
            {
                int fine = (daysLate - 14) * 5;
                throw new LateReturnException("Book is returned late. Fine: ₹" + fine);
            } 
            else 
            {
                System.out.println("Book returned on time. No fine.");
            }
        } 
        catch (LateReturnException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
public class Ass60 
{
	  public static void main(String[] args) {
	        Library lib = new Library();

	        lib.returnBook(10);  // No fine
	        lib.returnBook(18);  // Late by 4 days → ₹20 fine
	    }
}
