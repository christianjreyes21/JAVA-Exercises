package person;

public class Person
{
	String Name[] = new String[100];
	int Age [] = new int[100];
	int c = 0;
	
	public void setName(String i)
	{
		Name [c] = i;
	}
	
	public void setAge(int X)
	{
		Age [c] = X;
	}
	
	public void counterUp()
	{
	c++;
	}
	
	public int returnCount()
	{
	return c;
	}
	
	public String returnName(int i)
	{
	return Name[i];
	}
	
	public int returnAge(int i)
	{
	return Age[i];
	}
	
}