import java.util.*;
public class c9p4{
	public static void main(String [] args){


	Scanner reader = new Scanner(System.in);
	int i = 0;
	int [] num = new int [10];
	int average;
	int mode;

	while (i < 10){
		num [i] = reader.nextInt();
		i++;
	}

	mode = mode(num);
	int median = median(num);
		

	System.out.println("Mode : " + mode + " Median: " + median);


	










	}

public static int mode(int[] array){
	int oldNum = 0;
	int highNum = 0;
	int numCount = 0;
	int num;
	int [] high = new int [10];

	for(int element : array){
		int count = 0;
		int search = element;
		for(int i = 0; i < array.length; i++){
		
			if(array[i] == search){
				num = array[i];
				count++;
			}
			if(count > numCount){
				numCount = count;
				highNum = search;
			}	
		}
		}

		return highNum;
		
	}

public static int median(int [] array){
	//int [] order = new int [10];
	int high = 0; 
	int low = 0;
	int median = 0;


	for(int i = 0; i < array.length - 1; i++ ){
		if(array[i] > array[i + 1] && i < 10){
				
				low = array[i + 1];
				high = array[i]; 


				array[i + 1] =  high;
				array[i] = low;
				
				
			}
			
	}
	median = array [5];
	return median;



}
}	



	