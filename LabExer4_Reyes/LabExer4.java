public class LabExer4
{
	public static void main (String args[])
	{
		printPrime();
	}
	
	public static int primeNumbersQuantity = 100;
	public static int primeNumberContain [] = new int [primeNumbersQuantity];
	
	public static void printPrime ()
	{
		System.out.println("The first " + primeNumbersQuantity + " Prime Numbers are: ");
		for (int i=0; i<primeNumbersQuantity; i+=10)
		{
			for (int j=0; j<checkLoop(i); j++)
			{
				System.out.print(getPrime(i+j) + "\t");
			}
			
			System.out.println("");
		}
	}
	
	public static int checkLoop (int sentValue)
	{
		return ((primeNumbersQuantity-10 <= sentValue) ? primeNumbersQuantity-sentValue : 10);
	}	
	
	public static int getPrime (int countAddress)
	{
		int tempNumber = primeNumberContain[(countAddress == 0) ? countAddress : countAddress-1];
		
		do
		{
			tempNumber++;
		}
		while (checkPrime(tempNumber) != 1);
		
		primeNumberContain[countAddress]  = tempNumber;
		return (primeNumberContain[countAddress]);
	}
	
	public static int checkPrime (int tempNumber)
	{
		for (int i=2; i<tempNumber; i++)
		{
			if (tempNumber % i == 0)
			{
				return (0);
			}
		}
		
		return (1);
	}
}