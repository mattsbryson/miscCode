
public class gcd {

	
	public static void main(String [] args){
		double mynum = gcd(5.0, 0.5);
		System.out.println(mynum);
	}
	
	
	
	public static double gcd(double a, double b){
		double agcd = 0;
		int i = 0;
		System.out.println("Reached step zero " + agcd  + " B: " + b + " A: " + b);
		if(a == 0){
			agcd = b;
			System.out.println("Reached step one " + agcd + " B: " + b + " A: " + b);
		}
		else if(a > 0){
			agcd = gcd(b, a % b);
			System.out.println("Reached step two " + agcd);
		}
		else
			return -33;
		i++;
		System.out.println("I: " + i);
		return agcd;
		
		
		
	}
	
	
	
	
}
