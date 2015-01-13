import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordSearch 
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		String dict = "/lib/wordsEn.txt";
		Scanner reader = new Scanner(new File(dict));
		
		while(reader.hasNext())
		{
			String temp = reader.next();
			System.out.println(temp);
		}


	}
	
	
	static void saveCheck() throws FileNotFoundException
	{
		String dict = "/lib/wordsEn.txt";
		Scanner reader = new Scanner(new File(dict));
		
		while(reader.hasNext())
		{
			String temp = reader.next();
			System.out.println(temp);
		}

	}
	
	
}


