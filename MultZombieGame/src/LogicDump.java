import java.util.Scanner;


public class LogicDump{
	
	public LogicDump(){}
	
	static String nChoice;
	
	static String NostalgicChoice;
	
	static Scanner choice = new Scanner(System.in);
	
	public static void StrangeSoundsLogic()
	{
		
		
		System.out.println("\nThere’s a strange sound coming from outside, but you can’t quite make it out. " +
				"\nIt sounds like a low hum. Maybe a neighbor, or a car running? " +
				"\nYou walk to the window and open it a crack. " +
				"\nTo your horror, the street is swarming with the UNDEAD. " +
				"\nThis area is unsafe, and you, your sister, and Brad decide it would be best to flee into the countryside. ");
		
		System.out.println("\nYou are all experienced hikers, so you pack bags with some basic survival gear. " +
				"\nSome of your supplies include a tent, a radio, your weapons, water, and some canned food. " +
				"\nYou only bring the clothing on your backs. " +
				"\nYou know of a clean river about 15 miles out, and you decide to go there.  " +
				"\nNostalgia gets the best of you, though, and you might bring along something else due to sentimental reasons. " +
				"\nThere’s Oreo, your cat, who’s been with you for years. " +
				"\nThere’s a gardenia flower in a ceramic pot that your mother gave to you before she died. " +
				"\nAnd there’s a photo album that you may never see again.");
		
		System.out.print("Do you take CAT, FLOWERPOT, PHOTOALBUM : ");
		
		while(choice.hasNext())
		{
		
		nChoice = choice.next();
		
		NostalgicChoice = nChoice;
		
		
		if(nChoice.equalsIgnoreCase("cat"))
		{
			System.out.print("\nYou have taken Oreo, your fat and grumpy cat." +
					"\nThere’s no way that you can make it to a car to drive into the countryside." +
					"\nBesides, the undead are swarming in the street." +
					"\nYou, Sarah, and Brad duck out a back door and run for about a mile before slowing to a walk. " +
					"\nBy late afternoon, you reach your destination, but you can make out some figures on the banks of the river."+
					"\nDo you BACKTRACK or move FORWARD? : ");
			
			while (choice.hasNext())
			{
				nChoice = choice.next();
			
				if(nChoice.equalsIgnoreCase("backtrack"))
				{
					System.out.println("\nYou backtrack a few miles and stop for the night. " +
							"\nYou start a fire and set up the tent, but your camp is invaded by the undead at nightfall. " +
							"\nYour journey ends here.");
				}
				else if(nChoice.equalsIgnoreCase("FORWARD"))
				{
					System.out.println("\nYou walk cautiously up to the river and find that the strangers are other healthy people who’ve fled from the city. " +
							"\nTheir names are Emma, Randall, Owen, and Nicki. You decide to stick together, and make camp for the night. " +
							"\nNote: As you’re falling asleep, you hear Randall coughing repeatedly, until he is practically wheezing. " +
							"\nPneumonia was a common illness among those infected with the virus… ");
					
					System.out.println("\nYour cat keeps meowing in the middle of the night, and you open the tent door to let her outside. " +
							"\nYou gasp when you see that your campsite is surrounded by the undead. " +
							"\nYou don’t make a sound, but your silence only stalls your fate. " +
							"\nYour journey ends here.");
					break;
				}
			}
		}
		
		else if(nChoice.equalsIgnoreCase("flowerpot"))
		{
			System.out.println("\nYou have taken the flowepot."+
					"\nThere’s no way that you can make it to a car to drive into the countryside." +
					"\nBesides, the undead are swarming in the street." +
					"\nYou, Sarah, and Brad duck out a back door and run for about a mile before slowing to a walk. " +
					"\nBy late afternoon, you reach your destination, but you can make out some figures on the banks of the river."+
					"\nDo you BACKTRACK or move FORWARD? : ");
			
			while (choice.hasNext())
			{
				nChoice = choice.next();
			
				if(nChoice.equalsIgnoreCase("backtrack"))
				{
					System.out.println("\nYou backtrack a few miles and stop for the night. " +
							"\nYou start a fire and set up the tent, but your camp is invaded by the undead at nightfall. " +
							"\nYour journey ends here.");
				}
				else if(nChoice.equalsIgnoreCase("FORWARD"))
				{
					KeepGoing();
				}
			}
		}
		
		else if(nChoice.equalsIgnoreCase("photoalbum"))
		{
			System.out.print("\n\nYou have taken the photoalbum."+
					"\nThere’s no way that you can make it to a car to drive into the countryside." +
					"\nBesides, the undead are swarming in the street." +
					"\nYou, Sarah, and Brad duck out a back door and run for about a mile before slowing to a walk. " +
					"\nBy late afternoon, you reach your destination, but you can make out some figures on the banks of the river."+
					"\nDo you BACKTRACK or move FORWARD? : ");
			
			while (choice.hasNext())
			{
				nChoice = choice.next();
			
				if(nChoice.equalsIgnoreCase("backtrack"))
				{
					System.out.println("\nYou backtrack a few miles and stop for the night. " +
							"\nYou start a fire and set up the tent, but your camp is invaded by the undead at nightfall. " +
							"\nYour journey ends here.");
					break;
				}
				else if(nChoice.equalsIgnoreCase("FORWARD"))
				{
					KeepGoing();
				}
			}
		}
		
			else
			{
				System.out.print("\nTry again : ");
			}
		
		}	
	}
	
	public static void KeepGoing()
	{
		System.out.println("\nYou walk cautiously up to the river and find that the strangers are other healthy people who’ve fled from the city. " +
				"\nTheir names are Emma, Randall, Owen, and Nicki. You decide to stick together, and make camp for the night. " +
				"\nNote: As you’re falling asleep, you hear Randall coughing repeatedly, until he is practically wheezing. " +
				"\nPneumonia was a common illness among those infected with the virus… ");
				
		System.out.println("\nYou wake up the next morning to find your campsite turned over. " +
				"\nYou fear the worst, but you are disappointed when you discover that Emma, Owen, and Nicki " +
				"\nhave stolen your radio, your canned food, and even your matches. " +
				"\nLuckily, you still have a lighter and one can of soup in your bag… but Randall was " +
				"\nabandoned with you, and he seems to be getting increasingly sick.");
		
		System.out.print("\n\nDo you KEEP THE SOUP A SECRET AND DRINK IT YOURSELF, SHARE THE SOUP WITH EVERYONE" +
				"\n(INCLUDING RANDALL) ");
		
		while(choice.hasNext())
		{
			nChoice = choice.next();
			if(nChoice.equalsIgnoreCase("keep"))
			{
				System.out.println("\nYou drink the cold soup in private, when you say you’re getting firewood. " +
						"\nYou are energized and decide to seek food in the surrounding woods.");
				
				System.out.print("\nDo you FORAGE FOR BERRIES or INVITE BRAD TO HELP YOU HUNT GAME? ");
				
				while(choice.hasNext())
				{
					nChoice = choice.next();
					
					if(nChoice.equalsIgnoreCase("forage"))
					{
						ForageLogic();
					}
					
					else if(nChoice.equalsIgnoreCase("hunt"))
					{
						HuntLogic();
					}
				}
			}
	
			else if(nChoice.equalsIgnoreCase("share"))
			{
				System.out.println("\nYou are hungry for more soup as soon as you finish your small cup, but you feel good about sharing what you had. " +
						"\nThe group is irritated about being stolen from by the others, " +
						"\nbut you all decide that it is time to hunt for some wild game in the nearby woods. " +
						"\nYou INVITE BRAD TO COME ALONG.");
				HuntLogic();
			}
		}
		
	}
	
		public static void ForageLogic()
		{
			System.out.println("\nYou find quite a few red berries in the nearby woods, and share with the rest of the group." +
					"\nA few hours later, Sarah complains that she feels nauseous. " +
					"\nYou, too, feel a little dizzy. Unfortunately, you mistook a highly poisonous berry to be the raspberry. " +
					"\nYour journey ends here.");
		}
		
		public static void HuntLogic()
		{
			System.out.println("\nYou and Brad decide to go hunt for game in the woods. " +
					"\nYou can either bring your weapon along to help in the hunt, or you can leave " +
					"\nit behind with Sarah and Randall, who is growing sicker by the minute, just in case trouble comes along. ");
			
			System.out.print("Do you TAKE the weapon or LEAVE it with Sarah?");
			
			while(choice.hasNext())
			{
				nChoice = choice.next();
				
				if(nChoice.equalsIgnoreCase("take"))
				{
					System.out.println("\nYou bring your weapon and you’re able to overtake a small deer. " +
							"\nYou and Brad carry the deer back to camp… but Sarah and Randall were attacked and " +
							"\nkilled while you were gone, and they were defenseless. " +
							"\nThe guilt is unbearable. " +
							"\nYou don’t have any reason to keep on going in life. " +
							"\nYour journey ends here.");
					break;
				}
				
				else if(nChoice.equalsIgnoreCase("leave"))
				{
					System.out.println("\nYou and Brad are able to snare a rabbit, and you return back to camp a few hours later. " +
							"\nRandall is barely hanging on, and is unable to eat even when you offer some of your precious food." +
							"\nHe is wheezing and choking violently." +
							"\nSarah mentioned that the last thing he said was “Help me”. " +
							"\nHe is clearly is a lot of pain.");
					
					System.out.print("\nDo you GO ON A SUICIDE MISSION TO TRY AND FIND DRUGS IN THE CITY, " +
							"\nLEAVE HIM BE, PUT HIM OUT OF HIS MISERY? ");
					while(choice.hasNext())
					{
						nChoice = choice.next();
						if(nChoice.equalsIgnoreCase("mission"))
						{
							SuicideMission();
							break;
						}
						
						else if(nChoice.equalsIgnoreCase("abandon"))
						{
							LeaveHimBe();
						}
						
						else if(nChoice.equalsIgnoreCase("execute"))
						{
							PutHimOut();
						}
							
					}
				}
			}
			
		}
				
		public static void LeaveHimBe()
		{
			System.out.println("\nYou bundle Randall as best as you can with blankets and prop up his head. " +
					"\nHe seems to be in a deep sleep, and he is coughing less. " +
					"\nYou go to sleep early, hoping for an early start to scout out a camping site further away from the city.");
			
			System.out.println("\nSomething stirs you from our sleep in the dead of night, though. " +
					"\nYou turn over and Randall is standing over Brad and Sarah… and they are all COVERED IN BLOOD. " +
					"\nYou have little time to react!");
			
			System.out.print("\n\nDo you USE your weapon or FLEE?");
			
			while(choice.hasNext())
			{
				nChoice = choice.next();
				
				if(nChoice.equalsIgnoreCase("use"))
				{
					System.out.println("\nAs you stand on your feet, you look down to see your greatest nightmare realized. " +
							"\nYou try to kill Randall but he is too fast. " +
							"\nYour journey ends here.");
					break;
				}
				
				else if(nChoice.equalsIgnoreCase("flee"))
				{
					System.out.print("/nYou jump from your sleeping bag and scramble out the door. " +
							"\nIt was too late for Sarah or Brad. You hear footsteps thudding from behind you. " +
							"\nIt’s Randall and HE’S GAINING. You crouch to grab a rock, and when he catches up " +
							"\nto you, you try to crush his skull with it. The blow only gives Randall an " +
							"\nopportunity to seize you by your neck. " +
							"\nYour journey ends here.");
					break;
				}
			}
		}
		
		public static void SuicideMission()
		{
			System.out.println("\nYou go on a solo trip to the city, hoping to be able to find help at the hospital, or to at least smuggle out some drugs. " +
					"\nYou reach the hospital and enter though the main entrance, which is surrounded by shattered glass. " +
					"\nYou sneak your way into the Pharmacy, although the building seems to be abandoned. " +
					"\nYou scrounge through the limited shelves for a while, when all of a sudden you hear the door shut. " +
					"\nYou look up, and you are surrounded by the UNDEAD. " +
					"\nYou have your weapon, but everything happens too quickly. " +
					"\nYour journey ends here. ");
		}
		
		public static void PutHimOut()
		{
			System.out.println("\nYou, Brad, and Sarah decide it would be best to put him out of his misery, due to your lack of resources. " +
					"\nYou are the one to do the deed, in the privacy of the woods. " +
					"\nRandall was most likely infected, anyways. When you return to camp, the three of you decide that it " +
					"\nwould be best to scout for a camping site further from the city. ");
			
			if(NostalgicChoice.equalsIgnoreCase("photoalbum"))
			{
				System.out.println("\nYou slip Randall’s driver’s license into your photoalbum. " +
						"\nHis picture seems like it belongs with the photos of your other friends.");
			}
			
			System.out.println("Now you feel torn.");
			
			System.out.print("\nDo you FIRST GIVE RANDALL A PROPER BURIAL or HEAD FURTHER INTO THE COUNTRYSIDE IMMEDIATELY?");
			
			while(choice.hasNext())
			{
				nChoice = choice.next();
				
				if(nChoice.equalsIgnoreCase("burial"))
				{
					System.out.println("\nYou decide it best to at least bury Randall and say a few kind words, though you hardly knew him. " +
							"\nThe burial and makeshift service last all day, and as you prepare to go to sleep at night, you begin to cough violently. " +
							"\nIn fact, you’re seeing stars and even choking up blood. " +
							"\nThe look in Sarah’s eyes confirms the worst… you’re INFECTED. " +
							"\nYou probably only have a few days left. " +
							"\nYou lie down, and you know that your journey will end here. ");
					break;
				}
				
				else if(nChoice.equalsIgnoreCase("countryside"))
				{
					System.out.println("\nYou’re able to trek further into the countryside, and the three of you survive by catching fish and eating berries and nuts from the woods. " +
							"\nA few days into your trip, you find a group of about thirteen other survivors who know of a safe town " +
							"\nthat has remained uninfected…  Good job. " +
							"\nYour journey has had some close calls, but this news means that there’s hope for tomorrow.");
				break;
				
				}
			}
		}	
}

