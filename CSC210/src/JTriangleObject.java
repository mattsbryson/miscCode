//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JTriangleObject		CSC 210				//
//Comments		Special Project		Fall of 2012		//
//									Engr R.M. Politio	//
//									October 10, 2012	//
//////////////////////////////////////////////////////////


import java.util.Scanner;

public class JTriangleObject 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in)	;
		double A,B,C							;
		JTriangle MyTriangle = new JTriangle();
		
		System.out.print		("\t\t\tPlease enter the value of SideA: ");
		A = reader.nextDouble	(										);
		System.out.print		("\t\t\tPlease enter the value of SideB: ");
		B = reader.nextDouble	(										);
		System.out.print		("\t\t\tPlease enter the value of SideC: ");
		C = reader.nextDouble	(										);
		
		MyTriangle.setSideA		(A										);
		MyTriangle.setSideB		(B										);
		MyTriangle.setSideC		(C										);
		
		
		if((A + B > C) && (A + C > B) && (B + C > A))
		{
			System.out.print  ("\n\t\t\tPerimeter:                    ");
			System.out.format ("%10.3f", 	 MyTriangle.Perimeter 	 ());
			System.out.print  ("\n\t\t\tArea:                         ");
			System.out.format ("%10.3f", 	 MyTriangle.Area		 ());
			System.out.print  ("\n\t\t\tAltitudeA:                    ");
			System.out.format ("%10.3f",	 MyTriangle.AltitudeSideA());
			System.out.print  ("\n\t\t\tAltitudeB:                    ");
			System.out.format ("%10.3f", 	 MyTriangle.AltitudeSideB());
			System.out.print  ("\n\t\t\tAltitudeC:                    ");
			System.out.format ("%10.3f",     MyTriangle.AltitudeSideC());
			System.out.print  ("\n\t\t\tAngleA:                       ");
			System.out.format ("%10.3f", 	 MyTriangle.angleA	     ());
			System.out.print  ("\n\t\t\tAngleB:                       ");
			System.out.format ("%10.3f", 	 MyTriangle.angleB	     ());
			System.out.print  ("\n\t\t\tAngleC:                       ");
			System.out.format ("%10.3f",     MyTriangle.angleC	     ());
		}
		else
		{
			System.out.println("\t\t  The sides that were entered cannot form a triangle.");
		}
		
		System.out.print("\n\n\n");
	}

}
