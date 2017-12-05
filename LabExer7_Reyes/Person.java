public class Person extends Object
{
	private String name;
	private int age;
	private static int personCount=0;
	
	//constructors
	Person(String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	//setters
	public void setName(String name)
	{
		if (name.equals(""))
			this.name = "NO NAME";
		else
			this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	// getters
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public String getDetails()
	{
		personCount++;
		return "Name: " + getName() + "\n" + "Age: " + getAge();
	}
	
	public int getCount()
	{
		return personCount;
	}
	
}
