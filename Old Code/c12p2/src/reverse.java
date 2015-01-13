import java.util.Scanner;


public class reverse {

	public static String revOrder(String s, int pos){
		
		if(s.length() < pos){
		//	rev(s.charAt(arg0), s)
		}
		else{
			
		}
		
		
		return "";
	}
	
	public static String rev(int i, String s){
		int length = s.length() - 1;
		int y = length - i;
		String newS = "";
		System.out.println("This is y: " + y);
		if(y == length){
			y = length - i;
			newS += s.charAt(y);
			//System.out.println(s.charAt(y));
			System.out.println(y);
			i++;
			rev(y, s);
			//System.out.print(s.charAt(length));
			
		}
		
		if(y > -1){
			newS += rev(y, s);
			y++;
		}
		return newS;
	}
	
	/*public static void main(String [] args){
		System.out.println("Enter sentence: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int i = 0;
		String newS = "";
		int length = s.length() - 1;
		while(length > -1){
			newS += s.charAt(length);
			System.out.println(s.charAt(length));
			length--;
		}
		
		System.out.println(newS);
		
	}*/
	
	
	public static void main(String [] args){
		System.out.println("Enter sentence: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int i = 0;
		String newS = rev(0, s);
		
		
		System.out.println(newS);
	}
	
}
