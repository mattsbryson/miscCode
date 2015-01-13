
public class war {

	public static void main(String[] args) {
		
		Deck first = new Deck();
		first.shuffle();
		int i1 = 0;
		int i2 = 0;
		int p1w = 0;
		int p2w = 0;
		Card[] p1wins = new Card[52];
		Card[] p2wins = new Card[52];
		int i = 0;
		int adder = 26;
		int c = 0;
		Card[] player1 = new Card[26];
		Card[] player2 = new Card[26];
		
		player1 = first.deal(26);
		player2 = first.deal(26);

		while(i < 26){
			player1[i].turn();
			player2[i].turn();
			System.out.println("Player 1 has: " + player1[i].toString() + ". Player 2 has: " + player2[i].toString());
			if(player1[i].equals(player2[i])){
				System.out.println("A Tie! Moving on..");
				i++;
				//first.shuffle();
				//player1 = first.deal(26);
				//player2 = first.deal(26);
			}
			else if(player1[i].compareTo(player2[i]) > 0){
				System.out.println("Player 1 wins! The player gets both cards!");
				p1wins[p1w] = player2[i];
				p1w++;
				p1wins[p1w] = player1[i];
				p1w++;
				i++;
			}
			else if(player2[i].compareTo(player1[i]) > 0){
				System.out.println("Player 2 wins! The player gets both cards!");
				p2wins[p2w] = player2[i];
				p2w++;
				p2wins[p2w] = player1[i];
				p2w++;
				i++;
			}
				
			System.out.println("Cards Player: " + i);
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Player 1 won: " + p1w/2 + " rounds.");
		System.out.println("Player 2 won: " + p2w/2 + " rounds.");
		System.out.println();
		if(p1w > p2w){
			System.out.println("Player 1 won the game.");
		}
		else{
			System.out.println("Player 2 won the game.");
		}
			
		
		
	}

}
