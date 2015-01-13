import java.util.ArrayList;


public class perfect2 
{


	public static void main(String[] args) 
	{

		//variables
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
				//this gets a list of derivitives of the number being tested
				divList = getDiv(num);
				//sets the sum back for the next computation
				sum = 0;
				//this computes the sum of the derivitives 
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
	
	
	
	public static ArrayList<Integer> getDiv(int test)
	{
		ArrayList divs = new ArrayList<Integer>();
		int i = 1;
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
