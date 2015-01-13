import java.util.Scanner;
import java.io.*;

public class wordFinder {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String fileloc = "/Users/Matt/Java/c11p3/lib/text.txt";
		String target;
		System.out.println("Would you like to choose your own text file? Enter true or false.");
		Boolean choose = input.nextBoolean();
		if(choose){
			System.out.print("Please enter the exact location of that file: ");
			fileloc = input.next();  //text.txt
		}
		System.out.print("Please enter the word you would like to search for: ");
		target = input.next();
		
		int count = 0;
		int location = -1;
		//String file = "";
		int length = 0;
		
		
		
		
		Scanner reader = new Scanner(new File(fileloc));
		
		/*while(reader.hasNext()){
			file += reader.next();
		} */
			
		//System.out.println(file);
			
			
		while(reader.hasNext()){
			String temp = reader.next();
			//System.out.println(temp);
			length += temp.length();
			if (temp.equalsIgnoreCase(target)){
				count++;
				if(count == 1){
					location = length - temp.length();
				}
			}
			length += 1; //for spaces
		}
		
		System.out.println("Your word was found " + count + " times, and was first found at location " + location);		
				
				
				
		}

	}


