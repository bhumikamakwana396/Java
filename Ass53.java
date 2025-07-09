package com.Exception;

class InvalidQuantityException extends Exception
{
	public InvalidQuantityException(String message)
	{
		super(message);
	}
}

class ShoppingCart
{
	void addItem(String itemname,int quantity)
	{
		try
		{
			if(quantity<=0)
			{
				throw new InvalidQuantityException("Error: Invalid quantity");
			}
			else
			{
				System.out.println("ItemName: "+itemname+", Quantity: "+quantity);
			}
		}
		catch(InvalidQuantityException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class Ass53 
{
	public static void main(String[] args) 
	{
		ShoppingCart s=new ShoppingCart();
		s.addItem("Laptop", 0);
		
		s.addItem("TV", 2);
		
	}
}
