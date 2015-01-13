import java.io.FileNotFoundException;
import java.util.*;

public class gameInterface {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//code testing place
		
		
		
		
		//code testing place 
		
		
		Scanner reader = new Scanner(System.in);
		ship playerShip = new ship();
		
		//Game Setup
		
		//if(!(gameSave.lsaveCheck("setupcomp"))){
			
			System.out.println("Welcome aboard Captain.  We've been waiting for you to arrive to outfit the vessel.  \nThe ship can be outfitted with 8 weapons, each facing forward, aft, starboard, or port. \nThe weapon types are lasers, which are long range and use medium power, missles, which are long range and require lots of power, and photons, which are short range and low power.");
			System.out.print("But first you must name your vessel: ");
			playerShip.name(reader.nextLine());
			System.out.println("A wise choice Captain, " + playerShip.getName() + " is an excellent choice."); 
			int i = 0;
			int count = 0;
			while(i < 8){
				boolean passed = false;
				String wType;
				int y = i + 1;
				System.out.print("Now it is time to choose weapon number: " + y  + ".");
				System.out.print("Type: ");
				wType = reader.nextLine();
				
				if(wType.equalsIgnoreCase("photon") || wType.equalsIgnoreCase("laser") || wType.equalsIgnoreCase("missle")){
					playerShip.weaponSet(wType, i);
					passed = true;
					i++;
				}
				else{
					System.out.println("Please enter a valid weapon.");
				}
				
				while(passed){
					if(passed){
						System.out.print("Where do you want this weapon? Please specify its location on the ship using the keywords: forward, aft, port, and starboard: ");
						String wD = reader.nextLine();
				
					
					
						if((wD.equalsIgnoreCase("forward") || wD.equalsIgnoreCase("aft") || wD.equalsIgnoreCase("port") || wD.equalsIgnoreCase("starboard"))){
							playerShip.weaponDset(wD, count);
							saveWriter.writer("w"+y+wType+wD);
							count++;
							break;
						}
						else{
							System.out.println("Please enter a valid direction.");
						}
			
					}
				}
				
				
				passed = false;
			}
			
			saveWriter.writer("setupcomp");
			
		//}
	//	else{
				//get saved info
		//}
		
		
		//game
		
		
		//ship creator 
		ship enemyShip = new ship();
		String direction = "";
		int z = 0;
		while(z < 8){
			if(z<= 2){
				direction = "forward";
			}
			else if(z <= 4){
				direction = "starboard";
			}
			else if(z <= 6){
				direction = "port";
			}
			else
				direction = "aft";
			
			
			enemyShip.weaponSet("laser", z);
			enemyShip.weaponDset("direction", z);
			z++;
		}
		enemyShip.setX(15);
		enemyShip.setY(15);
		
		String relativeDir = location.directionFinder(playerShip, enemyShip);
		
		
		System.out.println("Captain a ship has appeared our sensor readout and is locking lasers on us. They are on our " + relativeDir + " side.");
		
		
		
		
		
		
		
		
		
		
		
	}

}


