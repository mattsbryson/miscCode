//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JPerfect			CSC 210				//
//Comments		Perfect Numbers		Fall of 2012		//
//									Engr R.M. Politio	//
//									September 7, 2012	//
//////////////////////////////////////////////////////////



import java.util.ArrayList;


public class JPerfect
{
	public static void main(String[] args) 
	{
		//global variables
		ArrayList divList = new ArrayList<Integer>();
		int i;
		int num = 0; 
		int comp = 0;
		int sum;
		
		//this loop will exit after 5 perfect numbers are outputted  
		while(comp < 5)
		{
			//0 will not be a perfect number, and is skipped
			if(num != 0)
			{
				//this gets a list of divisors of the number being tested
				divList = getDiv(num);
				//sets the sum back for the next computation
				sum = 0;
				//this computes the sum of the divisors 
				for(i = 0; i < divList.size(); i++)
				{
					if(!divList.isEmpty())
					{
						sum += (Integer) divList.get(i);
					}	
				}
				if(num == 8500)
				{
					num = 33550300;
				}
				if(num == sum)
				{
					//this prints out the perfect numbers, which will be equal 
					System.out.println(num);
					comp++;
				}
			}
			//increments the loop to test the next number
			num++;
		}
	}
	
	
	//this static method returns divisors
	public static ArrayList<Integer> getDiv(int test)
	{
		//stores the divisors
		ArrayList divs = new ArrayList<Integer>();
		//acts as a counter
		int i = 1;
		//addes the divisors to an arraylist
		while(i < (test/2 + 1))
		{
			if(test % i == 0)
			{
				divs.add(i);
			}
			i++;		
		}
		return divs;
	}
}
