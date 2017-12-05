package com.UST.domain;

public class Student
{
	private String name;
	private int studNo;
	private String course;
	
	
	public void Student (String n, int s, String c)
	{
		setName(n);
		setNo(s);
		setCourse(c);
	}
	
	public void setName(String n)
	{
		if (n != null)
		{
			name = n;
		}
		else
		{
			name = "noValue";
		}
	}
	

	public void setNo(int n)
	{	
		if (n >= 0)
		{
			studNo = n;
		}
		else
		{
		studNo = 0;
		}
	}
	
	public void setCourse(String n)
	{		
		if (n != null)
		{
			course = n;
		}
		else
		{
			course = "noValue";
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNo()
	{
		return studNo;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public String showDetails()
	{
		return getName() + "   has a student number of  " + getNo() + (" and taking up ") + getCourse() + "." ;
	}
	
}