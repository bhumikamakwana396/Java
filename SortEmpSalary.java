package com.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class SortEmpSalary implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2) 
	{
		int value=1;
		
		if(e1.getSalary()>e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		return value;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Emp> list= new ArrayList<Emp>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Daxa");
		e1.setSalary(25000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Diya");
		e2.setSalary(40000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Jigna");
		e3.setSalary(30000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Bhumi");
		e4.setSalary(50000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Emp e:list)
		{
			System.out.println("Eid: "+e.getEid()+" Ename: "+e.getEname()+" Salary: "+e.getSalary());
		}
		
		
	}
}
