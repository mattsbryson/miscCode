import java.math.*;
import java.util.ArrayList;

public class primeAlg {
	
	public static void main(String [] args){
		
		/*
		double i = 0;
		while(true){
			if(!((i%2==0) && (i%3==0) && (i%4==0) && (i%5==0) && (i%6 == 0) && (i%7==0) && (i%8 == 0) && (i%9==0))){
				System.out.println(i);
				
			}
			i++;	
		}
		
		*/
		
		
		ArrayList one = new ArrayList();
		one.add(1);
		one.add(13);
		one.add(122);
		one.add(133);
		one.add(11345);
		one.add(122);
		one.remove(0);
		int check = one.size();
		System.out.println(check);
		
		
		
	}
}
