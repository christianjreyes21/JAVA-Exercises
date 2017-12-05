package com.UST.test;

import java.util.*;
import com.UST.domain.*;

public class TestStudent
{
	public static void main(String args[])
	{
		Student a= new Student ();
		Student b= new Student ();
		Student c= new Student ();
		
		a.Student("Christian", 1019, "BS CS");
		b.Student(null, -1223,null);
		c.Student("Angela", 1234, "BS CS");
		
		System.out.println(a.showDetails());
		System.out.println(b.showDetails());
		System.out.println(c.showDetails());
	}
	


}
