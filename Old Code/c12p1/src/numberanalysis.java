import java.util.Scanner;


public class numberanalysis {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] inputs = new double[10];
		int i = 0;
		System.out.println("Enter 10 floating point numbers.");
		while(i < 10){
			inputs[i] = input.nextDouble();
			i++;
			//System.out.println("Count: " + i);
		}
		
		double average = average(inputs);
		double[] aboveAvg = aboveavg(inputs, average);
		
		System.out.println("This is the average: " + average);
		System.out.println("These numbers are above average: ");

		for(int x = 0; x < aboveAvg[10]; x++){
			if(x == 0){
				System.out.print(aboveAvg[x]);
				x++;
			}
			else{
				System.out.print(", " + aboveAvg[x]);
				x++;
			}
		}
	}

	public static double average(double[] array){
		double sum = 0;
		int y = 0;
		while(y < 10){
			sum += array[y];
			y++;
		}
		
		double average = sum/y;
		
		return average;
		
	}
	
	public static double[] aboveavg(double [] array, double average){
		int z = 0;
		int i = 0;
		double [] Aavg = new double [11];
		while(i<10){
			if(array[i] > average){
				Aavg[z] = array[i];
				z++;
			}
			i++;
		}
		Aavg[10] = z;
		return Aavg;
	}
	
	
	
}
