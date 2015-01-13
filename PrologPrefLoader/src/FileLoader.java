 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class FileLoader
{

	//File afile =new File("\\\\192.168.144.4\\Data\\Custom Software\\Matt_Apps\\PrologConnector\\PMCONN.INI");
	//File bfile =new File(userDir +  "\\AppData\\Roaming\\MPS\\Prolog Manager\\Version 9\\Configuration\\PMCONN.INI");
	//	  
	
	static void copy(String source, String dest) 
	{
		
		InputStream inStream = null;
		OutputStream outStream = null;
		
		try
		{
			 
			
			
	//		new File(dest).mkdirs();
			File afile =new File(source);
    	    File bfile =new File(dest);
    	    
    	    
    	    
    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0)
    	    {
    	    	outStream.write(buffer, 0, length);
    	    	
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    
 
    	}
		catch(IOException e)
    	{
    		e.printStackTrace();
    		System.out.println("If you aren't IT, call them.");
    	}
		

	}

}
