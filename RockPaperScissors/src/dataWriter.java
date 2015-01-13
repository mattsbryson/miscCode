import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataWriter {

		static String lsave = "/Users/Matt/Java/RockPaperScissors/lib/dataSetOne.txt";
		public static void writer(String write){
			BufferedWriter out;
			String read;
			try{
				out = new BufferedWriter(new FileWriter(lsave, true));
				//Write out the specified string to the file
				out.write(write);
				out.newLine();
				//flushes and closes the stream
				out.close();
				
				}catch(IOException e){
					System.out.println("There was a problem:" + e);
			}
		}
		
		public static void overWriter(String write, String loc){
			BufferedWriter out;
			String read;
			try{
				out = new BufferedWriter(new FileWriter(loc, true));
				//Write out the specified string to the file
				out.write(write);
				out.newLine();
				//flushes and closes the stream
				out.close();
				
				}catch(IOException e){
					System.out.println("There was a problem:" + e);
			}
		}
		
		public static ArrayList<String> reader() throws FileNotFoundException{
				String saveFile = "/Users/Matt/Java/RockPaperScissors/lib/dataSetOne.txt";
				ArrayList<String> data = new ArrayList();
				String temp = "";
				Scanner reader = new Scanner(new File(saveFile));
				while(reader.hasNext()){
					temp = reader.next();
					//System.out.println(temp);
					data.add(temp);
					
					
				}
				return data;
		}
		
		
}

	

