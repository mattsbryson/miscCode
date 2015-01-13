 import java.math.*;

public class location {

	public static String directionFinder(ship one, ship two){
		int oneX = one.xloc;
		int oneY = one.yloc;
		int twoX = two.xloc;
		int twoY = two.yloc;
		int ydistance = Math.abs(oneY - twoY);
		
		
		
		if(oneX < twoX && (Math.abs(oneY - twoY) < 3)){
			return "port";
		}
		else if(oneX > twoX && ydistance < 3)
			return "starboard";
		else if(oneY - twoY > 0 && ydistance >= 3){
			return "aft";
		}
		else
			return "forward";
		
		
		
	}
	
	
}
