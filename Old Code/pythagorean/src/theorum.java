import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;


public class theorum 
{

	
	public static void main(String[] args) 
	{
		//variables
		int i = 0, sol = 0, u = 2, v = 1;
		int a = 3, b = 4, c = 5; 
		//int[][] triples = new int[100][3];
		ArrayList triples = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("How many Pythagorean Triples would you like?");
		sol = input.nextInt();
		
		while(sol > i)
		{	
			a = (u * u) - (v * v);
			b = 2 * u * v;
			c = (u * u) + (v * v);
			System.out.println(" V:" + v + " U:" + u + " " + a + "," + b + "," + c);
			i++;
			u++;
			v++;
		}
	
		

	}

}
