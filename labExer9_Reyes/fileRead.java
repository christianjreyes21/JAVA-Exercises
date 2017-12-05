import java.io.*;
public class fileRead extends Object
{
	fileRead(String fileName) throws IOException
	{
		File picosFile = new File(fileName);
		BufferedReader br = 
			new BufferedReader(new FileReader(picosFile));
		String str;
		while((str = br.readLine()) != null)
		{
			passProcess p = new passProcess(str,1);
		}
		br.close();
		

	}
}