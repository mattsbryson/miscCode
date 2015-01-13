import java.io.*;


public class WordFinder 
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		try{
			  // Open the file that is the first 
			  // command line parameter
			  FileInputStream fstream = new FileInputStream("C:\\Users\\mbryson\\Dropbox\\Java\\WordSearch\\lib\\wordsEn.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  char [] let = new char[9];
			  int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
			  //Read File Line By Line
			  
			  while ((strLine = br.readLine()) != null)   
			  {
			  // Print the content on the console
				  if(strLine.length() == 9)
				  {
					  for(int i = 0; i < strLine.length(); i++)
					  {
						  let[i] = strLine.charAt(i);
					  }
					  for(int i = 0; i < let.length; i++)
					  {
						  if(let[i] == 'a')
						  {
							  aCount++;
							  for(int y = 0; y < let.length; y++)
							  {
								  if(let[y] == 'e')
								  {
									  eCount++;
									  for(int x = 0; x < let.length; x++)
									  {
										  if(let[x] == 'i')
										  {
											  iCount++;
											  for(int z = 0; z < let.length; z++)
											  {
												  if(let[z] == 'o')
												  {
													  oCount++;
													  for(int a = 0; a < let.length; a++)
													  {
														  if(let[a] == 'u')
														  {
															  uCount++;
															  
															  
														  }
													  }
												  }
											  }
										  }
									  }
								  }
							  }
						  }
					  }
					  
					 
				  }
									  
				  else
				  {
					  break;
				  }
				  
				  if(aCount == 1 || eCount == 1 || iCount == 1 || oCount == 1 || uCount == 1)
				  {
					  System.out.println(strLine);
				  }
			  
			  }
			  //Close the input stream
			  in.close();
			  }catch (Exception e)
			    {//Catch exception if any
			    	System.err.println("Error: " + e.getMessage());
			  }

	}
	
	
	
	
}


/*
 if(strLine.length() == 9)
				  {
					  
					  for(int i = 0; i < strLine.length(); i++)
					  {
						  let[i] = strLine.charAt(i);
					  }
					  for(int i = 0; i < let.length; i++)
					  {
						  if(let[i] == 'a')
						  {
							  for(int y = 0; y < let.length; y++)
							  {
								  if(let[y] == 'e')
								  {
									  for(int x = 0; x < let.length; x++)
									  {
										  if(let[x] == 'i')
										  {
											  for(int z = 0; z < let.length; z++)
											  {
												  if(let[z] == 'o')
												  {
													  for(int a = 0; a < let.length; a++)
													  {
														  if(let[a] == 'u')
														  {
															  for(int b = 0; b < let.length; b++)
															  {
																  if(let[b] == 'a' || let[b] == 'e' || let[b] == 'i' || let[b] == 'o' || let[b] == 'u')
																  {
																	  if(b == 0)
																	  {
																		  if(let[b + 1] == 'a' || let[b + 1] == 'e' || let[b + 1] == 'i' || let[b + 1] == 'o' || let[b + 1] == 'u')
																		  {
																			 break; 
																		  }
																		  else
																		  {
																			  System.out.println(strLine);
																		  }
			
																	  }
																	  else if(b < let.length - 1)
																	  {
																		  if(let[b + 1] == 'a' || let[b + 1] == 'e' || let[b + 1] == 'i' || let[b + 1] == 'o' || let[b + 1] == 'u')
																		  {
																			 break; 
																		  }
																		  else if(let[b - 1] == 'a' || let[b - 1] == 'e' || let[b - 1] == 'i' || let[b - 1] == 'o' || let[b - 1] == 'u')
																		  {
																			  break;
																		  }
																		  else
																		  {
																			  System.out.println(strLine);
																		  }
																		  
																	  }
																	  else
																	  {
																		  if(let[b - 1] == 'a' || let[b - 1] == 'e' || let[b - 1] == 'i' || let[b - 1] == 'o' || let[b - 1] == 'u')
																		  {
																			  break;
																		  }
																		  else
																		  {
																			  System.out.println(strLine);
																		  }
																		  
																	  }
																  }
															  }
															  System.out.println (strLine);
														  }
													  }
												  }
											  }
										  }
									  }
								  }
							  }
						  }
					  }
				  }
 */


