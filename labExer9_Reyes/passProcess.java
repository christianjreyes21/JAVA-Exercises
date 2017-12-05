public class passProcess extends Object
{
	private static int noCandidates = 3;
	private static int referenceSize = 100;
	private static int arrayCount=0;
	private static String name[] = new String[noCandidates];
	private static int votes[] = new int [noCandidates];
	private static String inputName[] = new String[referenceSize];
	private static int inputVotes[] = new int [referenceSize];
	
	
	passProcess(String rawInput, int mode)
	{
		switch(mode)
		{
			case 1:
				splitInput(rawInput);
				break;
			case 2:
				processInput();
				break;
		}

		
	}
	
	private void splitInput(String rawInput)
	{
		String finalInput[] = rawInput.split(",");
		setInputName(finalInput[0]);
		setInputVotes(Integer.parseInt (finalInput[1]));
		arrayCount++;
	}
	
	private void processInput()
	{
		for (int i=0; i< this.arrayCount; i++)
		{
			switch(getInputName(i))
			{
				case "Pedro":
					setName("Pedro", 0);
					setVotes(getVotes(0)+getInputVotes(i), 0);
					break;
				case "Juan":
					setName("Juan", 1);
					setVotes(getVotes(1)+getInputVotes(i), 1);
					break;
				case "Jose":
					setName("Jose", 2);
					setVotes(getVotes(2)+getInputVotes(i), 2);
					break;
					
			}
			

		}
	}
	
	private void setInputName(String name)
	{
		this.inputName[this.arrayCount] = name;
	}
	
	private void setName(String name, int arrayCount)
	{
		this.name[arrayCount] = name;
	}
	
	private void setInputVotes(int votes)
	{
		this.inputVotes[this.arrayCount] = votes;
	}
	
	private void setVotes(int votes, int arrayCount)
	{
		this.votes[arrayCount] = votes;
	}
	
	private String getInputName(int arrayCount)
	{
		return inputName[arrayCount];
	}
	
	public String getName(int arrayCount)
	{
		return name[arrayCount];
	}
	
	private int getInputVotes(int arrayCount)
	{
		return inputVotes[arrayCount];
	}
	
	public int getVotes(int arrayCount)
	{
		return votes[arrayCount];
	}
	
	public String getDetails()
	{
		return (getName(0) + "\t" + getVotes(0) + "\n" + getName(1) + "\t" + getVotes(1) + "\n" + getName(2) + "\t" + getVotes(2)); 
	}
}