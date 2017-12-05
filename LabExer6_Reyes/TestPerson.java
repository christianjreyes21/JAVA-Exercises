public class TestPerson
{
	public static void main (String args[])
	{
		String name[] = new String[2];
		int date[][] = new int [2][3];
		
		for (int i=0; i<2; i++)
		{
			String rawInput = args[i];
			String input[] = rawInput.split("/");
			name[i] = input[0];
			String numberData[] = input[1].split("-");
			
			for (int j=0; j<3; j++)
			{
				date[i][j] = Integer.parseInt (numberData[j]);
			}
		}
		
		MyDate p1Address = new MyDate(date[0][0], date[0][1], date[0][2]);
		MyDate p2Address = new MyDate(date[1][0], date[1][1], date[1][2]);
		
		Person p1 = new Person(name[0], p1Address);
		Person p2 = new Person(name[1], p2Address);
		
		if(p1.equals(p2))
			System.out.println("IDENTICAL");
		else
			System.out.println("NOT IDENTICAL");

		System.out.println(p1);
		System.out.println(p2);
		
		//System.out.println(p1.hashCode());
		//System.out.println(p2.hashCode());


	}
}