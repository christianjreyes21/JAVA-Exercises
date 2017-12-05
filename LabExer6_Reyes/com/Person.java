public class Person extends MyDate {

	private String name; 
	private MyDate DoB;
	
	
	public Person(String name, MyDate DoB) {
		this.name = new Name(name);
		this.DoB = new dob(month, day, year);
	}
	
	public int DoB() {
		return DoB;
	}
	
	public String getName() {
		return name;
	}
	public int hashCode() {
		return getName().hashcode() ^ m.getMonth();
	}
		
	public String toString() {
		return getName() + " at age " + m.getMonth();
	}
}