import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class textHandler 
{
	public String textReader(String Script,int counter)
	{
		
		String text = "";
		int textCounter = 1;
		
		//The try catch structure makes sure that there is a readable file to use for the text
		try
		{
		Scanner scan = new Scanner(new File(Script));	
		//Reads the word document and pulls the required line
		while (scan.hasNextLine() && textCounter <= counter)
		{
			text = scan.nextLine();
			textCounter++;
		}
		
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found you dumb fuck, it's probably named wrong");
			System.out.println("File also needs to be in the JRE System Library and junk");
		}

		return text;
	}
}
