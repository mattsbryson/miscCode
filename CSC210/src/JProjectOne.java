//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JProjectOne			CSC 210				//
//Comments		Project One			Fall of 2012		//
//									Engr R.M. Politio	//
//									September 7, 2012	//
//////////////////////////////////////////////////////////

public class JProjectOne 
{
	public static void main(String[] MeUp) 
	{
		//Display Heading on the screen for project submission
		//THIS IS REQUIRED
		int a,b,c;
		double x, C, F;
		
		
		
		/*System.out.println("\t\t\t CALIFORNIA LUTHERAN UNIVERSITY");
		System.out.println("\t\t\t Department of Computer Science"	);
		System.out.println("\n\t\t\t\t Fall of 2012"				);
		System.out.println("\n\n\t\t\t\t Matt Bryson"				);
		*/
		
		System.out.println("\n\n\t\t\t  United States of America"	);
		System.out.println("\t\t\t\tWashington DC"					);
		System.out.println("\n\t\t\t   Office of the President"		);
		System.out.println("\t\t\t\t Barack Obama"					);
		System.out.println("\n\t\t\t\t 2008 - 2012"					);
		
		a = 1														;
		b = 4;
		c = 4;										//Variables Assigned
		x = (-b + Math.sqrt(b * b -4.0 * a * c)) / (2.0 * a);		//Quadratic Formula
		
		System.out.println(	"\n\n\t\t    if a = " + a + " b = " + b + 
							" and c = " + c	+ " then x = " + x		);
		
		a = 1; b = 10; c = 25;										//Variables Reassigned 
		x = (-b + Math.sqrt(b * b -4.0 * a * c)) / (2.0 * a); 		//Quadratic Formula 
		
		System.out.println(	"\n\n\t\t    if a = " + a + " b = " + b + 
				" and c = " + c	+ " then x = " + x		);
		
		C = 100;
		F = 9.0/5.0 * C + 32;										//C to F 
		
		System.out.println(	"\n\n\t\t    if C = " + C + ", then "
							+ "degrees F = " + F					);
		System.out.println("\n\n\t\t\t\t Matt Bryson"				);
		
		
	}
}
