import java.util.Scanner;

public class wordstats {

// words in a sentence, avg word length length of sentence 
	
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String sentence;
		
		System.out.print("Please enter a sentence: ");
		sentence = reader.nextLine();
		int wordCount = wordCount(sentence);
		int sL = sentenceLength(sentence, wordCount);
		int aW = avgWord(sentence, wordCount);
		
		
		System.out.println("Word Count: "+ wordCount);
		System.out.println("Sentence Length: " + sL);
		System.out.println("Average Word Length: "+ aW);
		
		
		

	}

	public static int wordCount(String s){
	
		Scanner reader = new Scanner(s);
		int count = 0;
		
		while(reader.hasNext()){
			reader.next();
			count++;
		}
		
		return count;
		
	}
	
	public static int avgWord(String s,int wordC){
		int sLength = s.length();
		int avg = sLength/wordC;
		return avg;
	}
	
	public static int sentenceLength(String s, int wordC){
		int sL = 0;
		
		if(wordC == 1){
			sL = s.length();
		}
		if(wordC > 1){
			sL = s.length() - wordC + 1;
		}
		
		
		return sL;
	
	}

}



