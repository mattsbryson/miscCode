import java.util.Random;


public class Myarraystester {

	public static void main(String[] args) {
		int [] array = new int[3000];
		int i = 0;
		Random generator = new Random();
		
		while(i < 3000){
			array[i] = generator.nextInt();
			i++;
		}
		
		boolean binary = MyArrays.Bsearch(array, 10);
		/*for(i = 0; i < array.length; i++){
			System.out.println(array [i]);
		}*/
		
		System.out.println("(Uses linear) Is there a 5 in the array: " + MyArrays.Lsearch(array, 5));
		System.out.println("(Uses binary) Is there a 10 in the array: " + binary);
		MyArrays.sSort(array);
		
		
		System.out.println("Check out the first 20 values of the sorted array: ");
		for(i = 0; i < 21; i++){
			System.out.println(array [i]);
		}

	}

}
