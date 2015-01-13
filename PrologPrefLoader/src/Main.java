import java.io.File;


public class Main 
{

	public static void main(String[] args)
	{
		String userDir = System.getenv("userprofile");
		String path1 = userDir +  "\\AppData\\Roaming\\MPS\\Prolog Manager\\Version 9\\Configuration\\";
		String path2 = userDir +  "\\AppData\\Roaming\\MPS\\License Manager\\Version 9\\Configuration\\";
		String file1 = "\\\\192.168.144.4\\Data\\Custom Software\\Matt_Apps\\PrologConnector\\PMCONN.INI";
		String dest1 = (userDir +  "\\AppData\\Roaming\\MPS\\Prolog Manager\\Version 9\\Configuration\\PMCONN.INI");
		String file2 = "\\\\192.168.144.4\\Data\\Custom Software\\Matt_Apps\\PrologConnector\\LICMGR.INI";
		String dest2 = userDir +  "\\AppData\\Roaming\\MPS\\License Manager\\Version 9\\Configuration\\LICMGR.INI";

		
		new File(path1).mkdirs();
		new File(path2).mkdirs();
		FileLoader.copy(file1, dest1);
		FileLoader.copy(file2, dest2);
		System.out.println("Prolog connection settings established.");
		
	}

}
