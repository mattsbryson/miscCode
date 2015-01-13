//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JTran				CSC 210				//
//Comments		Formula Translation	Fall of 2012		//
//									Engr R.M. Politio	//
//									September 7, 2012	//
//////////////////////////////////////////////////////////
import java.math.*;

public class JTran
{
	public static void main(String[] MeUp) 
   	{

/*
 		double F,C;
		C = -40.0;
		F = 9.0/5.0 * C + 32;
		System.out.println("\n\t\tThe value of F = " + F);
*/
		double a,b,c;
	
		System.out.println("\n\t\tThe square root of 4 = " + Math.sqrt(5));
//		System.out.format(" ", 4)
		a = 1.0;
		b = 10.0;
		c = 25.0;
		
		System.out.println("\n\t\tThe root is equal to " + (-b + Math.sqrt(b * b -4.0 * a * c)) / (2.0 * a));
		//Should be 5
		
	}

}