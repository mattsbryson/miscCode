import java.util.Scanner;


public class StuckInCityLogic {

	public StuckInCityLogic()
	{
		
	}
	
	public static void Logic()
	{
		String wChoice;
		Scanner choice = new Scanner(System.in);
		
		System.out.println("\nYou find an old, battery-powered radio and find out that all of the deceased have " +
				"\nCOME BACK TO LIFE and are attacking and eating the living. " +
				"\nThese “undead” are fast, strong and somewhat intelligent. " +
				"\nTheir brains must be destroyed in order to kill them. " +
				"\nThere’s also a risk of becoming infected if you come into direct contact with them. " +
				"\nYou have reinforced the windows and the doors with plywood. Now you need a weapon, just in case.");
		System.out.print("\nDo you take the SHOTGUN WITH 20 SHELLS, MACHETE, OR BASEBALL BAT : ");
		
		while( choice.hasNext())
		{
			wChoice = choice.next();
			
			if(wChoice.equalsIgnoreCase("shotgun"))
			{
				System.out.println("You have chosen the shotgun with 20 shells.");
				
				System.out.println("\nNow, you light some candles because there is no power. " +
						"\nYou eventually fall asleep on the couch, your weapon not far away. " +
						"\nYou wake up early the next morning to strange sounds coming from outside.");
				LogicDump.StrangeSoundsLogic();			}
			
			else if(wChoice.equalsIgnoreCase("machete"))
			{
				System.out.println("You have chosen the machete.");
				
				System.out.println("\nNow, you light some candles because there is no power. " +
						"\nYou eventually fall asleep on the couch, your weapon not far away. " +
						"\nYou wake up early the next morning to strange sounds coming from outside.");
				LogicDump.StrangeSoundsLogic();
			}
			
			else if(wChoice.equalsIgnoreCase("bat"))
			{
				System.out.println("You have chosen the bat.");
				
				System.out.println("\nNow, you light some candles because there is no power. " +
						"\nYou eventually fall asleep on the couch, your weapon not far away. " +
						"\nYou wake up early the next morning to strange sounds coming from outside.");
				LogicDump.StrangeSoundsLogic();
			}
			else
			{
				System.out.print("\nTry again : ");
			}
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
