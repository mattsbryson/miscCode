import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class saveWriter {
	
	
	static String lsave = "/Users/Matt/Java/spacegame/lib/saves.txt";
	public static void writer(String write){
		BufferedWriter out;
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
	
	
}
