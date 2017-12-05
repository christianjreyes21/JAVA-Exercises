public class TestPerson
{
	public static void main (String args[])
	{
		String name[] = new String[args.length];
		int age[] = new int [args.length];
		String course[] = new String [args.length];
		
		for (int i=0; i<args.length; i++)
		{
			String rawInput = args[i];
			String input[] = rawInput.split(",");
			
			
			if (input[1].charAt(0) >= '0' && input[1].charAt(0) <= '9')
			{
				name[i] = input[0];
				age[i] = Integer.parseInt (input[1]);
			}
			else
			{
				
			}
			
			if (input.length == 3)
			{
				course[i] = input[2];
			}
		}
		
		int personObjects=0;
		int studentObjects=0;
		
		for (int i=0; i<args.length; i++)
		{
			if (course[i] == null)
			{
				Person p = new Person(name[i], age[i]);
				System.out.println("\n" + p.getDetails());
				personObjects = p.getCount();
			}
			else
			{
				Student s = new Student(name[i], age[i], course[i]);
				System.out.println("\n" + s.getDetails());
				studentObjects = s.getCount();
			}
			
		}
		
		System.out.println("\n" + (personObjects + studentObjects) +  " object/s created, " +
											 personObjects + " Person object/s created, " + 
											 studentObjects + " Student object/s created.");
	}
}