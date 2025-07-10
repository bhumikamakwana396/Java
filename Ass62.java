package com.Exception;

class FileTooLargeException extends Exception
{
	public FileTooLargeException(String message)
	{
		super(message);
	}
}

class FileInvalidTypeException extends Exception
{
	FileInvalidTypeException(String message)
	{
		super(message);
	}
}

class FileUploder
{
	public void uploadFile(double sizeInMB,String type)throws FileTooLargeException,FileInvalidTypeException
	{
		if(sizeInMB>100)
		{
			throw new FileTooLargeException("Upload File Fails File size is large in limit 100mb:");
		}
		if(!type.endsWith(".jpg")&&!type.endsWith(".png")&&!type.endsWith(".pdf"))
		{
			throw new FileInvalidTypeException("Upload file falid,only jpg,png,pdf file are allowed");
		}
		System.out.println("File"+type+" upload successfully.Size: "+sizeInMB+" MB");
	}
}
public class Ass62 
{
	public static void main(String[] args) {
		FileUploder f1=new FileUploder();
		try
		{
			f1.uploadFile(90,"1.jpg");
		}
		catch(FileTooLargeException | FileInvalidTypeException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			f1.uploadFile(120,"2.pdf");
		}
		catch(FileTooLargeException | FileInvalidTypeException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			f1.uploadFile(40,"2.exe");
		}
		catch(FileTooLargeException | FileInvalidTypeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
