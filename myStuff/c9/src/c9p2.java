import java.util.Scanner;

public class c9p2{
	public static void main(String [] args){


	Scanner reader = new Scanner(System.in);
	int i = 0;
	double [] num = new double [10];
	double average;

	while (i < 10){
		num [i] = reader.nextDouble();
		i++;
	}

	average = average(num);


	System.out.print("The average is " + average);
	for(int count = 0; count < 10; count++){
		if(count == 0)
			System.out.print("These numbers are greater than the average, " + 				average + ".");
		if(num[count] > average)
			System.out.print(num[count]);	
	}










	}

public static double average(double[] array){
	double r1, sum = 0;
	double count = 0;
	for(double element : array){
		sum += element;
		count++;
	}
	r1 = sum/count;
	return r1;
}




}	



	