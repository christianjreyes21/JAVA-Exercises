public class MyDate extends Object {

	private int day, month, year;
	
	public MyDate(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}	
}
/*
class Person extends Object {	

	private String name; 
	private MyDate DoB;
	public Person(String name, MyDate DoB) {
		this.name = new Name(name);
		this.DoB = new dob(month, day, year);
		this.DoB.setMonth(month);
		this.DoB.setDay(day);
		this.DoB.setYear(year);
	}
	
	String i = String.parseString( DoB );
	
	public String DoB() {
		return DoB.toString();
	}
	
	public String getName() {
		return name;
	}
	
}	*/