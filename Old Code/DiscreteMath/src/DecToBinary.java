import java.util.Scanner;


public class DecToBinary 
{

	public static void main(String[] args) 
	{
		int base;
		int num;
		int [] conv = new int [1000];
		int rem;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the base you are converting to: ");
		base = reader.nextInt();
		System.out.print("Enter the number you are converting: ");
		num = reader.nextInt();
		
	
		int i = 0;
		while(num >= base)
		{
			rem = num % base;
			num = (num / base);
			conv [i] = rem;
		}
		
		
		
		//invert the string! 
		
		int length = conv.length;
		
	
		

	}

}
