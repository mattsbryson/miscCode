import java.util.*;
import java.io.*;

public class gameSave {

	static boolean setup;
	String saveFile = "/Users/Matt/Java/spacegame/lib/saves.txt";
	static String lsave = "/Users/Matt/Java/spacegame/lib/saves.txt";
	
	public gameSave(){
		setup = false;
		
	}
	
	
	public static void setupComp(boolean done){
		setup = done;
		if(done){
			saveWriter.writer("setupcomp");
		}
	}
	
	
	public boolean saveCheck(String search) throws FileNotFoundException{
		Scanner reader = new Scanner(new File(saveFile));
		boolean save = false;
		while(reader.hasNext()){
		String temp = reader.next();
			if (temp.equalsIgnoreCase(search)){
				save = true;
			}
			
		}
	
		return save;
	}
	
	
	public static boolean lsaveCheck(String search) throws FileNotFoundException{
		Scanner reader = new Scanner(new File(lsave));
		boolean save = false;
		while(reader.hasNext()){
		String temp = reader.next();
			if (temp.equalsIgnoreCase(search)){
				save = true;
			}
			
		}
	
		return save;
	}
	
	
	
	
	
	
}
