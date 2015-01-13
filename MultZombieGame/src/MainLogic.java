import java.util.*;


public class MainLogic 
{

	public static void main(String[] args) 
	{
	
		//variables
		Scanner reader = new Scanner(System.in);
		
		String charName = ""; 
		String charGender = "";
		String vChoice = "";
		String StayOrLeave = "";
		
		
		String mainChar; 
		String secChar;
		String supChar1;
		String supChar2;
		String supChar3;
		//end of variables
		
		
		
		
		
		System.out.print("Please enter your name: ");
		reader.hasNext();
		charName = reader.next();

		System.out.println("Welcome to Super Zombie Murder Simulator, " + charName);
		
		System.out.println("\nYou see on the news that there is an outbreak of a highly infectious and fatal disease in the city." +
				"\nYour sister, Sarah, is in the city and has no car. You need to pick her up before the city is quarantines. " +
				"\nNote: Traffic to the city is minimal.");
		
		System.out.print(charName + " You now have a choice. Do you take your car, motorcylce, or rv: ");
		
		while(reader.hasNext())
		{
			vChoice = reader.next();
			
		if(vChoice.equalsIgnoreCase("car"))
		{
			String carChoice = "\nYou drive to the city and meet up with your sister and her boyfriend, Brad. " +
			"\nThere's nobody on the streets because it seems that most people are in the hospital. " +
			"\nYou only have enough gas to make it home, because the gas stations are closed." +
			"\nThe three of you decide to stick together.";
			carChoice += ("Do you stay in the city or do you go back home?  ");
		
				vChoice = reader.next();
				
				if( vChoice.equalsIgnoreCase("stay"))
				{
					System.out.println("You have decided to stay in the city.");
					StuckInCityLogic.Logic();
				}
				
				else if (vChoice.equalsIgnoreCase("home"))
				{
					System.out.println("You have decide to go home.");
					AtHomeLogic.HomeLogic();
					
				}
			
			
		}
		else if(vChoice.equalsIgnoreCase("motorcycle"))
		{
			System.out.println("Your sister has a boyfriend, Brad, and she refuses to leave the city without him. " +
			"You’re stuck in the city, for now. You stay at her apartment." +
			"Note: The streets seem empty.");
			AtHomeLogic.HomeLogic();
		}
		else if(vChoice.equalsIgnoreCase("rv"))
		{
			System.out.println("\nYou run out of gas when you reach the city, and all of the gas stations are closed.  " +
					"\nYou stay in the city with your sister and her boyfriend, Brad." +
					"\nThe three of you seem to be the only people around- word is, most people are in the hospital.");
			AtHomeLogic.HomeLogic();
		}
		else if(vChoice.equalsIgnoreCase("batmobile"))
		{
			System.out.println("You've won. There's simply no way to lose with the batmobile.");
		}
		else
		{
			System.out.println("Really? You can't spell a simple vehicle choice?");
		}
		
		}
	}

}
