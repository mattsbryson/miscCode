//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JTest1				CSC 210				//
//Comments		First Test			Fall of 2012		//
//									Engr R.M. Politio	//
//									September 7, 2012	//
//////////////////////////////////////////////////////////

public class JTest1 
{
	public static void main(String[] MeUp) 
	{
		int i, j;
		
		
		
		
		System.out.println("\t\t\t CALIFORNIA LUTHERAN UNIVERSITY");
		System.out.println("\t\t\t Department of Computer Science");
		System.out.println("\n\t\t     Introduction to Computer Programming");
		System.out.println("\t\t\t      CSC 210 - Fall 2012");
		System.out.println("\n\n\t\t\t\t Matt Bryson");
		System.out.println("\n\t\t\t   First Test Sep 28, 2012 \n\n");
		
		
		for(j = 0; j < 4; j++)
		{
			if(j == 0)
			{
				i = 0;
				while(i < 10)
				{
					if(i == 0)
					{
						System.out.print("\n\t\t The numbers are: ");
						System.out.print(i + ",");
					}
					else if (i == 9)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(i + ",");
					}
					i++;
				}
			}
			else if(j == 1)
			{
				i = 0;
				while(i < 10)
				{
					if(i == 0)
					{
						System.out.print("\n\t\t The numbers are: ");
						System.out.print((i + 1)+ ",");
					}
					else if (i == 9)
					{
						System.out.println(i + 1);
					}
					else
					{
						System.out.print((i + 1) + ",");
					}
					i++;
				}
			}
			else if(j == 2)
			{
				i = 0;
				while(i < 20)
				{
					if(i == 0)
					{
						System.out.print("\n\t\t The numbers are: ");
						i++;
						System.out.print(i+ ",");
					}
					else if (i == 19)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(i + ",");
					}
					i++;
					i++;
				}	
			}
			else
			{
				i = 2;
				while(i < 21)
				{
					if(i == 2)
					{
						System.out.print("\n\t\t The numbers are: ");
						System.out.print(i+ ",");
					}
					else if (i == 20)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(i + ",");
					}
					i++;
					i++;
				}
			}
		}
		
		
		/*for(j = 0; j < 4; j++)
		{
			if(j == 0)
			{
				i = 0;
				while(i < 10)
				{
					if(i == 0)
					{
						System.out.print("\n\t\t The numbers are: ");
						System.out.print(i + ",");
					}
					else if (i == 9)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(i + ",");
					}
					i++;
				}
			}
			else if(j == 1)
			{
				i = 0;
				while(i < 10)
				{
					if(i == 0)
					{
						System.out.print("\n\t\t The numbers are: ");
						System.out.print((i + 1)+ ",");
					}
					else if (i == 9)
					{
						System.out.println(i + 1);
					}
					else
					{
						System.out.print((i + 1) + ",");
					}
					i++;
				}
			}
			else if(j == 2)
			{
				i = 0;
				while(i < 20)
				{
					if(i == 0)
					{
						System.out.print("\n\t\t The numbers are: ");
						i++;
						System.out.print(i+ ",");
					}
					else if (i == 19)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(i + ",");
					}
					i++;
					i++;
				}	
			}
			else
			{
				i = 2;
				while(i < 21)
				{
					if(i == 2)
					{
						System.out.print("\n\t\t The numbers are: ");
						System.out.print("  " + i+ ",");
					}
					else if (i == 20)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(i + ",");
					}
					i++;
					i++;
				}
			}
		}
		
		
	*/	
		

		
	 
	}
}
