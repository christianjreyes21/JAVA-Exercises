class IllegalObjectCreationException extends Exception
{}
public class TestPerson
{
		
	public static void main(String args[]) 
	{
	
		Person p = null;
		int personObject = 0, studentObject = 0; 
				
			for(int ctr = 0; ctr < args.length; ctr++) 
			{
				
				String str[] = args[ctr].split(",");
				try 
				{
					if(str.length == 1) 
					{
						throw new IllegalObjectCreationException();
					}		
					else if(str.length == 2) 
					{
						String personName = str[0];
						char firstChar = str[1].charAt(0);	
						if((firstChar>='\u0030') && (firstChar<='\u0039'))
						{
							int personAge = Integer.parseInt(str[1]);				
 
							if (personAge < 0) 
							{
								throw new IllegalObjectCreationException();
							}
							
							p = new Person(personName, personAge);
							System.out.println(p.getDetails());
				
							personObject++;
						}
						else
						{
							throw new IllegalObjectCreationException();
						}
					}
				
					else if(str.length == 3) 
					{
						String studentName = str[0];
						int studentAge = Integer.parseInt(str[1]);
						String course = str[2];	
					
						if (studentAge < 0) 
						{
							throw new IllegalObjectCreationException();
						}
						p = new Student(studentName, studentAge, course);
						System.out.println(p.getDetails());
				
						studentObject++;
					}
				}
				catch(IllegalObjectCreationException ioce) 
				{
					System.out.println("\nException caught, incorrect / incomplete information" +"\n");					
				}	
				
			}
		System.out.println(personObject + studentObject + " object/s created, " + personObject +
							" Person object/s created, " + studentObject + " Student object/s created.");
	}
}