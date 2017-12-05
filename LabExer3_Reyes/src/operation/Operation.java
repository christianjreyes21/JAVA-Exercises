package operation;

public class Operation
{
	private int a;
	private int b;
	private int result;
	
	public void getInt(int x, int y)
	{
		a = x;
		b = y;
	}
	
	public int multiply  ()
	{
		for (int i = 0; i < b ; i++)
		{
			result+=a;
		}
		return result;		
	}
	
	public int divide  ()
	{
		for (int i = 0 ; customMultiply (i,b) <= a ; i++)
		{
			result = i;
		}
		return result;
	}
	
	public int remainder  ()
	{
		result = a;
		while (result >= b)
		{
			result -= b;
		}
		return result;
	}
	
	public int customMultiply (int x, int y)
	{
		int z = 0;
		for (int i = 0; i < y ; i++)
		{
			z +=x;
		}
		return z;
	}
	
	public void showDetails ()
	{
		System.out.println ("The product of " + a + " and " + b + " is: " + multiply());
		System.out.println ("The integer quotient of " + a + " and " + b + " is: " + divide());
		System.out.println ("The integer remainder of " + a + " and " + b + " is: " + remainder());
	}
	
}