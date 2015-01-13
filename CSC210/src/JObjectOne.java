//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JObjectOne				CSC 210				//
//Comments		Second Test			Fall of 2012		//
//									Engr R.M. Politio	//
//									September 7, 2012	//
//////////////////////////////////////////////////////////

public class JObjectOne
{
	public static void main(String[] MeUp) 
	{
		JCircle MyCircle = new JCircle();
			
		MyCircle.setRadius(10.0);
		
		System.out.println("\n\t\tDiameter 	= " + MyCircle.Diameter		()	);
		System.out.println("\n\t\tCircumfrence = " + MyCircle.Circumfrence	()	);
		System.out.println("\n\t\tArea = 		" + MyCircle.Area			()	);
		
		System.out.println("\n\n\n");
	}
}
