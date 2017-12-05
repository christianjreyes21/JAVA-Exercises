public class Person extends Object
{
	private String name;
	private MyDate dob;
	
	//constructors
	Person(String name, MyDate dob)
	{
		setName(name);
		setDob(dob);
	}
	
	//setters
	public void setName(String name)
	{
		if (name == "")
			this.name = null;
		else
			this.name = name;
	}
	
	public void setDob(MyDate dob)
	{
		if (dob.equals(""))
			this.dob= null;
		else
			this.dob = dob;
	}
	
	// getters
	public String getName()
	{
		return name;
	}
	public MyDate getDob()
	{
		return dob;
	}
	// override the equals method
	public boolean equals(Object o)
	{
		boolean result = false;
		if (o != null && o instanceof Person)
		{
			Person p = (Person)o;
			if (this.getName().equals(p.getName()))
			{
				result = true;
			}
		}
		return result;
	}
	
	// override the hashCode method
	public int hashCode()
	{
		return getName().hashCode() ^ getDob().hashCode();
	}

	// override the toString method
	public String toString()
	{
		return "Name: " + getName() + "\n" + 
		       "Birthdate: " + getDob();
	}
	
}
