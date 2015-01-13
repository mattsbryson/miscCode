import java.util.Random;


public class TheMatrix
{

	public static void main(String[] args) 
	{
		Random gen = new Random();
		int i = 0;
		while(true)
		{
			char me = (char) gen.nextInt(255);
			System.out.print(me);

			i++;
		}
		
	}

}
