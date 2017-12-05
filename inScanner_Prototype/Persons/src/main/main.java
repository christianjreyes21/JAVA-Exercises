package main;

import java.util.*;
import person.*;

public class main
{
	public static void main(String args[])
	{
		Person person= new Person();
		
		Scanner read = new Scanner (System.in);
		
		String name;
		int age;
		
		System.out.print("Enter the name followed by the age: ");
		
		do
		{
			name = read.next();
			if (!name.equals("end"))
			{
				age = read.nextInt();
				person.setName(name);
				person.setAge(age);
				person.counterUp();
			}

		}
		while  (!name.equals("end"));
		
		int count = person.returnCount();
		
		for (int i = 0; i < count; i++)
		{
			System.out.println (person.returnName(i) + "   " + person.returnAge(i));
		}

	}
	


}
