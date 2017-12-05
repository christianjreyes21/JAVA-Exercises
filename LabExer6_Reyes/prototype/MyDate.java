public class MyDate extends Object
{

	private int month, day, year;
	
	
	//constructors
	public MyDate(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	/*
	//setters
	public void setMonth(int m)
	{
		if (month>12)
			month = 0;
		else
			month = m;
	]
	
	public void setDay(int d)
	{
		if (day>0)
			day = d;
		else 
			day = 0;
	}
	
	public void setYear(int y)
	{
		if (year>0)
			year = y;
		else
			year = 0;
	}
	*/
	
	//getters
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	//overriding the equals method
	public boolean equals(Object o)
	{
		boolean result = false;
		if (o != null && o instanceof MyDate)
		{
			MyDate md = (MyDate) o;
			if (this.getMonth() == md.getMonth()
			  && this.getDay() == md.getDay()
			  && this. getYear() == md.getYear())
			{
				result = true;
			}
		}
		return result;
	}
	
	//overriding the hashCode method
	public int hashCode()
	{
		return getMonth() ^ getDay() ^ getYear();
	}
	
	public String toString()
	{
		return getMonth() + "-" + getDay() + "-" + getYear();
	}
}