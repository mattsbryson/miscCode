import java.util.Scanner;


public class selectionsort {
	
	public static void main(String args []){
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter 10 numbers to be sorted: ");
		int[] array = new int[10];
		
		for(int i = 0; i != 10 && i < 10; i++){
			array[i] = reader.nextInt();
		}
		
		
		for(int i = 0; i != 10 && i < 10; i++){
			System.out.println(array [i]);
		}
	
		
		sSort(array);
		
		for(int i = 0; i != 10 && i < 10; i++){
			System.out.println(array [i]);
		}
		
		
		
		
		
		
	}
	
	
	public static void sSort(int[] a){
		for(int i = 0; i < a.length - 1; i++){
			int minI = findMinimum(a, i);
			if(minI != i)
				swap(a, i, minI);
		}
	}
	
	public static int findMinimum(int [] a, int first){
		int minIndex = first;
		
		for(int i = first + 1; i < a.length; i++){
			if(a[i] < a[minIndex])
				minIndex = i;
		}
		return minIndex;
	}
	
	public static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
}


