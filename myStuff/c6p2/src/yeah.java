import java.util.Scanner;
import java.util.Random;

public class yeah{
	public static void main(String [] args){
	
	int correct, guessa, guessb, guess, count, total, stotal, guesser;
	guessa = 0;
	guessb = 0;
	count = 0;
	total = 100;
	stotal = total;
	
	Random generator = new Random();
	Scanner reader = new Scanner(System.in);
	Boolean win = false;	


	System.out.println("What number would you like the computer to guess? " );
	correct = reader.nextInt(); 

	





	guess = 50;

	if(correct == guess){
		System.out.println("I win.");
		System.out.println(guess);
		count++;
	}
	else if(correct > guess){
		count++;
		guess = 75;
		System.out.println(guess);
	}
	else{
		guess = 25;
		count++;
		System.out.println(guess);
	}

	
	
	if(guess ==  75){
		if(guess == correct){
			System.out.println("I win.");
			count++;
			System.out.println(guess);
		}
		else if(correct > guess){
			guess = 85;
			count++;
			System.out.println(guess);
		}
		else if(correct < guess){
			guess = 60;
			count++;
			System.out.println(guess);
		}
	}
	else{
		if(guess == correct){
			System.out.println("I win.");
			count++;
			System.out.println(guess);
		}
		else if(correct > guess){
			guess = 40;
			count++;
			System.out.println(guess);
		}
		else if(correct < guess){
			guess = 15;
			count++;
			System.out.println(guess);
		}
	}

	


	if(guess == 15){
		if(guess == correct){
			System.out.println("I win.");
			count++;
			System.out.println(guess);
		}
		else if(correct > guess){
			guess = 7;
			count++;
			System.out.println(guess);
		}
		else if(correct < guess){
			guess = 20;
			count++;
			System.out.println(guess);
		}	
	}
	else if(guess == 40){
		if(guess == correct){
			System.out.println("I win.");
			count++;
			System.out.println(guess);
		}
		else if(correct > guess){
			guess = 30;
			count++;
			System.out.println(guess);
		}
		else if(correct < guess){
			guess = 45;
			count++;
			System.out.println(guess);
		}	
	else if(guess == 60){
		if(guess == correct){
			System.out.println("I win.");
			count++;
			System.out.println(guess);
		}
		else if(correct > guess){
			guess = 55;
			count++;
			System.out.println(guess);
		}
		else if(correct < guess){
			guess = 70;
			count++;
			System.out.println(guess);
		}	
	else if(guess == 85){
		if(guess == correct){
			System.out.println("I win.");
			count++;
			System.out.println(guess);
		}
		else if(correct > guess){
			guess = 75;
			count++;
			System.out.println(guess);
		}
		else if(correct < guess){
			guess = 95;
			count++;
			System.out.println(guess);
		}




	}
	
	







	/*while(correct != guess){
	
	guess = generator.nextInt(101);
	System.out.println("I guessed " + guess);
	
	count++;
	if(guess == correct)
	System.out.println("I win.");
	else if(correct > guess){
	guess = generator.nextInt(51
	}

	System.out.println("I guessed " + count + " times.");
	*/
	


	
	