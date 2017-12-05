import java.io.*;
public class fileWrite extends Object
{
	fileWrite(String lastValue, String data)  throws IOException
	{
		File outputFile = new File(lastValue);
		PrintWriter output = 
			new PrintWriter(new FileWriter(outputFile, true));
		output.println(data);
		output.close();
	}
}
