import java.util.Scanner;


public class AtHomeLogic {
	
	public AtHomeLogic(){}
	
	public static void HomeLogic()
	{
		String wChoice;
		
		Scanner choice = new Scanner(System.in);
		
		System.out.println("\nYour phone and internet are not working. " +
				"\nYou turn on the radio and find out that all of the deceased have COME BACK TO LIFE and " +
				"\nare attacking and eating the living. " +
				"\nThese “undead” are fast, strong and somewhat intelligent. " +
				"\nTheir brains must be destroyed in order to kill them. " +
				"\nThere’s also a risk of becoming infected if you come into direct contact with them. ");
		
		System.out.print("\nYou race home, barely navigating around all of the abandoned cars. " +
				"\nYou lock the doors and windows, and secure the garage door. " +
				"\nNow you need a weapon, just in case." +
				"\nDo you take the HANDGUN WITH 20 ROUNDS, AXE, CROBAR: ");
		
		choice.hasNext();
		
			wChoice = choice.next();
			
			if(wChoice.equalsIgnoreCase("handgun"))
			{
				System.out.println("You have chosen the handgun with 20 rounds.");
			}
			
			else if(wChoice.equalsIgnoreCase("axe"))
			{
				System.out.println("You have chosent the axe");
			}
			
			else if(wChoice.equalsIgnoreCase("crobar"))
			{
				System.out.println("You have chosen the crobar.");
			}
		
		System.out.println("\nYou have a hard time falling asleep, but you eventually ease up after you light some candles," +
				"\nbecause the power is out. Your weapon sits close to your bed." + 
				"\nYou fall asleep late in the night, and wake up the next day to strange sounds coming from outside.");
		
		LogicDump.StrangeSoundsLogic();
	}

}
