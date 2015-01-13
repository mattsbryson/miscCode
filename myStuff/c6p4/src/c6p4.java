import java.util.Scanner;

public class c6p4{

	public static void main (String [] args){

		
		Scanner reader = new Scanner(System.in);
	
		
		int percent =0;
		int sum = 0;
		int count = 0;
		int average;
		int high = 0;
		int low = 0;
		

		while(percent != -1){
		System.out.print("What is your grade, represented numerically? Enter" + 		" negative one to quit. ");
		percent = reader.nextInt();
		sum += percent;
		count++;

		if(percent > high){
			high = percent;
		}
		if(percent < low){
			low = percent;
		}
		
		
		}

				
		average = sum/count;
		
		System.out.println("Average: " + getGrade(average) + " Low: " + getGrade(low) + 
				" High: " + getGrade(high));

	}

	
		int number = 0;
		public static String getGrade(int n){
		//Get a student's grade

		int number = n;
		String grade;
		if(number >= 96)
		grade = "A+";
		else if(number < 96 && number >= 92)
		grade = "A";
		else if(number < 92 && number >= 90)
		grade = "A-";
		else if(number < 90 && number >= 86)
		grade = "B+";
		else if(number < 86 && number >= 82)
		grade = "B";
		else if(number < 82 && number >= 80)
		grade = "B-";
		else if(number < 80 && number >= 76)
		grade = "C+";
		else if(number < 76 && number >= 72)
		grade = "C";
		else if(number < 72 && number >= 70)
		grade = "C-";
		else if(number < 70 && number >= 66)
		grade = "D+";
		else if(number < 66 && number >= 62)
		grade = "D";
		else if(number < 62 && number >= 60)
		grade = "D-";
		else
		grade = "F";
		return grade;
	}



	




	
}