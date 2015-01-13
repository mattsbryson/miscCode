import java.io.FileNotFoundException;
import java.util.*;

public class game {

	public static void main(String [] args){
	
		Scanner reader = new Scanner(System.in);
		int r = 0;
		int s = 2;
		int p = 1;
		int input = 0;
		int currentGuess;
		int winner;
		String stringGuess;
		String gameOut;
		String writeS;
		int win = 0;
		int loss = 0;
		int tie = 0;
		int turnC = 0;
		int old1 = -1;
		int old2 = -1;
		int rockC = 0;
		int paperC = 0;
		int scissorsC = 0;
		int compOld1 = -1;
		int compOld2 = -1;
		
		
		
		System.out.println("To quit, enter 42.");
		while(true){
			System.out.print("Rock, Paper, Scissors? Rock is 0, Paper is 1, and Scissors is 2.");
			try{
				input = reader.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Come on, really? You just had to enter a word, didn't you? You just killed the program, congrats.");
				break;
			}
			
			currentGuess = 0;
			try {
				currentGuess = whatsNext(dataWriter.reader(), turnC, old1, old2, win, loss, tie, rockC, paperC, scissorsC, compOld1, compOld2);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			stringGuess = numToWord(currentGuess);
			winner = decWinner(input, currentGuess);
			
			if(input == 0){
				rockC++;
			}
			else if(input == 1){
				paperC++;
			}
			else{
				scissorsC++;
			}
			
			if(winner == 1){
				System.out.println("The computer guessed " + stringGuess + ".");
				gameOut = "You won!";
				writeS = input + "/" + currentGuess + "/" + winner;
				if(turnC == 0 || turnC % 2 == 0){
					old1 = input;
					compOld1 = currentGuess;
				}
				else{
					old2 = input;
					compOld2 = currentGuess;
				}
				dataWriter.writer(writeS);
				win++;
			}
			else if(winner == -1){
				System.out.println("The computer guessed " + stringGuess + ".");
				gameOut = "You lost...";
				writeS = input + "/" + currentGuess + "/" + winner;
				if(turnC == 0 || turnC % 2 == 0){
					old1 = input;
					compOld1 = currentGuess;
				}
				else{
					old2 = input;
					compOld2 = currentGuess;
				}
				dataWriter.writer(writeS);
				loss++;
			}
			else if(winner == 0){
				System.out.println("The computer guessed " + stringGuess + ".");
				gameOut = "A Tie!";
				writeS = input + "/" + currentGuess + "/" + winner;
				if(turnC == 0 || turnC % 2 == 0){
					old1 = input;
					compOld1 = currentGuess;
				}
				else{
					old2 = input;
					compOld2 = currentGuess;
				}
				dataWriter.writer(writeS);
				tie++;
			}
			else if(input == 42){
				break;
			}
			else 
				gameOut = "You just lost THE GAME.";
			System.out.println(gameOut);
			System.out.println("Wins: " + win + " Ties: " + tie + " Losses: " + loss);
			turnC++;
			
			
		}
		
		int rockCount = 0;
		try {
			rockCount = dataCounter(dataWriter.reader(), "scissors", "human");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println("This is a scissors count for human: " + rockCount);
		
		
		/*String localData = "";
		try {
			localData = dataWriter.reader();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(localData);
		*/
	
	}
	
	public static int guessGen(){
		int guess;
		Random Generator = new Random();
		guess = Generator.nextInt(3);
		return guess;
		
	}
	
	//compares first to second, 0 is tie, 1 is player 1 winning, -1 is player one losing. if a 2 is returned it is an error
	public static int decWinner(int a, int b){
		String t = "tie";
		if(a == b){
			return 0;
		}
		else if(a == 0 && b == 1){
			return -1;
		}
		else if(a == 0 && b == 2){
			return 1;
		}
		else if(a == 2 && b == 1){
			return 1;
		}
		else if(a == 2 && b == 0){
			return -1;
		}
		else if(a == 1 && b == 0){
			return 1;
		}
		else if(a == 1 && b == 2){
			return -1;
		}
		else if(a == 72){
			return 3;
		}
		else if(a == 19){
			return 52;
		}
		else
			return 2;
		
	}
	
	public static String numToWord(int a){
		if(a == 0)
			return "rock";
		else if(a == 1)
			return "paper";
		else 
			return "scissors";
	}
	
	//returns number of the type you have inserted
	public static int dataCounter(ArrayList<String> dataList, String search, String typeOfData){
		int i = 0;
		int rockC = 0;
		int paperC = 0;
		int scissorsC = 0;
		int y;
		int doesntMatter = 0;
		String dChar;
		String rChar = "0";
		String temp = "";
		int stop = 0;
		if(typeOfData.equalsIgnoreCase("human")){
			y= 0;
			stop = 1;
		}
		else if(typeOfData.equalsIgnoreCase("comp")){
			y = 1;
			stop = 2;
		}
		else{
			y=0;
			stop = 3;
		}
		//System.out.println("Data List Size: " + dataList.size());
		while(dataList.size() > i){
			temp = dataList.get(i);
			y = 0;
			while(y < stop){
				dChar = temp.substring(y, y+1);
				//System.out.println(dChar);
				if(dChar.equalsIgnoreCase(rChar)){
					rockC++;
				}
				else if(dChar.equalsIgnoreCase("1")){
					paperC++;
				}
				else if(dChar.equalsIgnoreCase("2")){
					scissorsC++;
				}
				else
					doesntMatter = -1;
				y++;
			}
			i++;
		}
		//System.out.println(" RockC: " + rockC + " PaperC: " + paperC + " ScissorsC: " + scissorsC + " Search: " + search);
		if(search.equalsIgnoreCase("rock")){
			return rockC;
		}
		else if(search.equalsIgnoreCase("paper")){
			return paperC;
		}
		else if(search.equalsIgnoreCase("scissors")){
			return scissorsC;
		}
		else 
			return doesntMatter;
	}
	
	public static int whatsNext(ArrayList<String> dataList, int turn, int old1, int old2, int win, int loss, int tie, int rC, int pC, int sC, int compOld1, int compOld2){
		double rockAvg;
		double scissorsAvg;
		double paperAvg;
		rockAvg = average(dataList, "rock", "human");
		paperAvg = average(dataList, "paper", "human");
		scissorsAvg = average(dataList, "scissors", "human");
		//System.out.println("Rockavg :" + rockAvg + " Paperavg: " + paperAvg + " Scissorsavg: " + scissorsAvg + " Turn: " + turn);
		if(turn == 0){
			return guessGen();
		}
		else if(old1 == old2){
			if(old1 == 0){
				return 1;
			}
			else if(old1 == 1){
				return 2;
			}
			else 
				return 0;
		}
		else if(old1 == 1 && old2 == 0){
			return 0;
		}
		else if(old1 == 2 && old2 == 1){
			return 1;
		}
		else if(old1 == 0 && old2 == 2){
			return 2;
		}
		else if(loss >= win - 5 && !(tie + win > loss + 7)){
			if(compOld2 == 0 && old2 == 0){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 0 && old2 == 1){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 0 && old2 == 2){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 1 && old2 == 0){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 1 && old2 == 1){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 1 && old2 == 2){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 2 && old2 == 0){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
		
			else if(compOld2 == 2 && old2 == 1){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
			else if(compOld2 == 2 && old2 == 2){
				if(old1 == 0){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else if(old1 == 1){
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
				else{
					if(compOld1 == 0){
						return 2;
					}
					else if(compOld1 == 1){
						return 0;
					}
					else{
						return 1; 
					}
				}
			}
		}
		
		else{
			if(rockAvg > paperAvg && scissorsAvg < rockAvg){
				return 1;
			}
			else if(paperAvg > scissorsAvg && scissorsAvg > rockAvg){
				return 2;
			}
			else if(scissorsAvg > rockAvg && rockAvg > paperAvg){
				return 0;
			}
			else
				return guessGen();
		}
		
		System.out.println("I guessed. ");
		return guessGen();
		
		
	
	}
	
	public static double average(ArrayList<String> dataList, String type, String human){
		int length = dataList.size();
		double average;
		int count = dataCounter(dataList, type, human);
		average = (double) count/length;
		//System.out.println("Data count: " + count + "Avg: " + average);
		return average;
	}
	
	
	
}
