
public class perfect {


	public static void main(String[] args) {
	
		int comp = 5;
		int num = 0;
		int [] div;
		int divI = 0;
		int sum;
		int z;
		
		
		while(comp <= 5){
			
			sum = 0;
			if(num != 0){
				div = getDiv(num);
				
				
				/*for(int i = 0; i < 10; i++){
					System.out.println("DivList " + i + ": " + div[i]);
				} */
				
				
				
				
				while(div[divI] < num && divI < 10){
					sum += div[divI];
					System.out.println("Sum " + sum + "Num: " + num + " DivI:" + divI);
					divI++;
				}
				
			}
			
			if(sum == num && num != 0){
				System.out.println(num);
				comp++;
			}
			
			num++;
			
		}
		

	}
	
	
	
	public static int[] getDiv(int test){
		int [] divs  = new int [10];
		int i = 1;
		int y = 0;
		//this won't be needed once an ArrayList object is implemented - MByson
		int z = 0;
		while(z < 10){
			divs [z] = test + 2;
			z++;
		}
		// end of section
		//System.out.println("I got to second part of div");
		
		while(i < test){
			if(test % i == 0 && y < 10){
				divs [y] = i;
				//System.out.println("Div: " + i);
				y++;
			}
			i++;
		}
		
		return divs;
	}

}
