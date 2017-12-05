public class Student extends Person
{
	private String course;
	private static int studentCount=0;
	
	//constructors
	Student(String name, int age, String course)
	{
		super(name,age);
		setCourse(course);
	}
	
	//setters
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	
	// getters
	public String getCourse()
	{
		return course;
	}
	
	public String getDetails()
	{
		studentCount++;
		return "Name: " + super.getName() + "\n" + "Age: " + super.getAge() + "\nCourse: " + getCourse();
	}
	
	public int getCount()
	{
		return studentCount;
	}
	
}
