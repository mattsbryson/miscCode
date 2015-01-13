import java.util.Random;
import java.util.*;


public class stickapprox {

	public static void main(String[] args) {
		Random gen = new Random();
		int [] drop = new int[400];
		int hit = 0, miss = 0; 
		int []rotation = new int [400];
		double []random = new double [400];
		/*for(int i = 0; i < 400; i++){
			drop[i] = gen.nextInt(2);
		}*/
		
		
		for(int i = 0; i < 400; i++){
			drop[i] = gen.nextInt(181);
		}
		
		for(int i = 0; i < 400; i++){
			random[i] = gen.nextDouble();
		}
		
		//if sin > random from 0 to 1 hit 
		
		for(int i = 0; i < 400; i++){
			if(Math.sin(gen.nextInt(181)) > gen.nextDouble()){
				hit++;
			}
			else
				miss++;
		}
		/*for(int i = 0; i < 400; i++){
			if(drop[i] == 1){
				System.out.println("Hit");
				hit++;
			}
			else{
				System.out.println("Miss");
				miss++;
			}
		}*/
		
		for(int i = 0; i < 400; i++){
			System.out.println(drop[i]);
		}
		
		double probablity = 400/hit;
		
		System.out.println("Probablity: " + probablity);
		

	}

}
