package main;

import java.util.*;
import person.*;

public class main
{


	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		Person person= new Person();
		
		System.out.print("Enter your name followed by your age: ");
		
		String b = read.next();
		int a = read.nextInt();
		
		
		person.setName(b);
		person.setAge(a);
	}
}
