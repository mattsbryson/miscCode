import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class Finder
{

	public static void main(String[] args) 
	{
		String path1; //7
		String path2; //xp
		String innerPath;
		
		
		
		
		ArrayList ipList = new ArrayList();
		for(int i = 0; i < 257; i++)
		{
			ipList.add("192.168.144." + i);
			//System.out.println(ipList.get(i));
		}
		
		/*
		
		System.out.println("Windows 7 Scan Begun");
		for(int x = 0; x < 257; x++)
		{
			path1 = "\\\\" + ipList.get(x) + "\\c$\\Users\\";
			path2 = "\\\\" + ipList.get(x) + "\\c$\\Documents and Settings\\";
			//path1 = "\\\\" + "192.168.144.94" + "\\c$\\Users\\";
			File folder = new File(path1);
			 int z = 0;
			if(isReachableByPing((String) ipList.get(x)) && folder.isDirectory())
			{
				File[] listOfFiles = folder.listFiles();
			    for (int i = 0; i < listOfFiles.length; i++) 
			    {
				     File temp = listOfFiles[i];
				     if(temp.isDirectory())
				     {
				    	 innerPath = listOfFiles[i].toString();
				    	 File pTemp = new File(innerPath);
				    	
				    	 try
				    	 {
					    	 if(pTemp.isDirectory())
					    	 {
					    		 String[] files = pTemp.list();
					    		 if(!(files.length == 0))
					    		 {
					    			 for(int y = 0; y < files.length; y++)
						    		 {
						    			 if(files[y].contains("exe"))
						    			 {
						    				 System.out.println(files[y]);
						    				 System.out.println("Virus detected: " + path1);
						    			 }
						    		 } 
					    		 }
					    		 
					    		
					    	 }
				    	 }
				    	 catch(Exception e)
				    	 {
				    		 e.printStackTrace();
				    	 }
				    	
				     }
				    
			    }
			    
			}
			 if(z == 0)
	    	 {
	    		 System.out.println("No virus found, moving on.");
	    		 System.out.println("X: " + x);
	    	 }
	    
			
		}	
			
			
		*/
			
			
			
			
		
			
		File[] listOfFiles;
			
			System.out.println("Windows XP Scan Begun");
			for(int x = 1; x < 256; x++)
			{

				path2 = "\\\\" + ipList.get(x) + "\\c$\\Documents and Settings\\";
				//path1 = "\\\\" + "192.168.144.94" + "\\c$\\Users\\";
				File folder = new File(path2);
				
				 int z = 0;
				 System.out.println(path2);
				if(isReachableByPing((String) ipList.get(x)) && folder.isDirectory() && folder.canRead())
				{
					try
					{
						if(folder.length() > 0)
						{
							listOfFiles = folder.listFiles();
							System.out.println("List of Files length: " + listOfFiles.length);
							for (int i = 0; i < listOfFiles.length; i++) 
						    {
							     File temp = listOfFiles[i];
							     if(temp.isDirectory())
							     {
							    	 innerPath = listOfFiles[i].toString();
							    	 File pTemp = new File(innerPath);
							    	
							    	 try
							    	 {
								    	 if(pTemp.isDirectory())
								    	 {
								    		 String[] files = pTemp.list();
								    		 if(!(files.length == 0))
								    		 {
								    			 for(int y = 0; y < files.length; y++)
									    		 {
									    			 if(files[y].contains("exe"))
									    			 {
									    				 System.out.println(files[y]);
									    				 System.out.println("Virus detected: " + path2);
									    			 }
									    		 } 
								    		 }
								    		 
								    		
								    	 }
							    	 }
							    	 catch(Exception e)
							    	 {
							    		 e.printStackTrace();
							    	 }
							    	
							     }
							    
						    }
						
					    
					    
					}
					 if(z == 0)
			    	 {
			    		 System.out.println("No virus found, moving on.");
			    		 System.out.println("X: " + x);
			    	 }
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
				}
				
			}	
			
			
			
			
			
		
		
	
		

	}
	
	
	
	public static boolean isReachableByPing(String host) {
	    try{
	            String cmd = "";
	            if(System.getProperty("os.name").startsWith("Windows")) {   
	                    // For Windows
	                    cmd = "ping -n 1 " + host;
	            } else {
	                    // For Linux and OSX
	                    cmd = "ping -c 1 " + host;
	            }

	            Process myProcess = Runtime.getRuntime().exec(cmd);
	            myProcess.waitFor();

	            if(myProcess.exitValue() == 0) {

	                    return true;
	            } else {

	                    return false;
	            }

	    } catch( Exception e ) {

	            e.printStackTrace();
	            return false;
	    }
	}

}
