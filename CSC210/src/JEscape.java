//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JTest				CSC 210				//
//Comments		Escape Characters	Fall of 2012		//
//									Engr R.M. Politio	//
//									September 7, 2012	//
//////////////////////////////////////////////////////////

public class JEscape
{
	public static void main(String[] MeUp) 
   	{
		/*System.out.println("\t\t\t CALIFORNIA LUTHERAN UNIVERSITY");
		System.out.println("\t\t\t\t Thousand Oaks \n");
		System.out.println("\t\t\t Department of Computer Science");
		System.out.println("\t\t\t   CSC 210 - Fall of 2012");*/
		
		
		
		String CLU = "California Lutheran University";
		String TO = "Thousand Oaks \n";
		String DCS = "Department of Computer Science";
		String CSC = "CSC 210 - Fall of 2012";
		
		System.out.println(center(CLU) + CLU);
		System.out.println(center(TO) + TO);
		System.out.println(center(DCS) + DCS);
		System.out.println(center(CSC) + CSC);
		
		
		
	}
	
	
	
	
	public static String center(String s)
	{
		int length = s.length();
		int i = 0;
		String spaces = "";
		while((80 - length) / 2 > i){
			spaces += " ";
			i++;
		}
		return spaces;
	}

}
