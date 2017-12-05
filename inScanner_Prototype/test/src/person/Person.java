package person;

public class Person
{
	public void setAge(int i)
	{
		if (i <= 0)
		{
		System.out.println("Invalid Age");
		}
		else
		{
		System.out.println("Age = " + i);
		}
	}
	public void setName(String i)
	{
		System.out.println("Hello " + i);
	}
}