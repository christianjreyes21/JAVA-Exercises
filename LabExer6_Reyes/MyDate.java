public class MyDate extends Object
{

	private int month, day, year;
	
	
	//constructors
	public MyDate(int month, int day, int year)
	{
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	//setters
	public void setMonth(int month)
	{
		if (month>12)
			this.month = 0;
		else
			this.month = month;
	}
	
	public void setDay(int day)
	{
		if (day>0 && day<32)
			this.day = day;
		else 
			this.day = 0;
	}
	
	public void setYear(int year)
	{
		if (year>0)
			this.year = year;
		else
			this.year = 0;
	}
	
	
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
			if (this.getMonth() == md.getMonth() && this.getDay() == md.getDay() && this.getYear() == md.getYear())
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