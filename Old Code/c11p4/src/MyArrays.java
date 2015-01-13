
public class MyArrays {

	public static boolean Lsearch(int[] a, int searchV){
		Boolean found = false;
		for(int i = 0; i < a.length; i++){
			if(a[i] == searchV)
				found = true;
		}
		
		return found;	
	}
	
	public static boolean Bsearch(int [] a, int searchV){
		int left = 0;
		Boolean found = false;
		int right = a.length - 1;
		while(left <= right){
			int midpoint = (left + right) / 2;
			if(a [midpoint] == searchV)
				found = true;
			else if (a[midpoint] < searchV)
				left = midpoint + 1;
			else 
				right = midpoint - 1;
		}
		return found;
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
