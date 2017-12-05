import java.io.*;
public class MySolution
{
	public static void main(String args[]) throws IOException
	{
		for(int i=0; i < args.length-1; i++)
		{
			fileRead p = new fileRead(args[i]);
		}
		
		passProcess a = new passProcess(null,2);
		System.out.println(a.getDetails());
		fileWrite b = new fileWrite(args[args.length-1],a.getDetails());
	}
}
