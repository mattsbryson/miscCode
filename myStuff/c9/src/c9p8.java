import java.util.Scanner;

public class c9p8{
	//private static String debug;


	public static void main(String [] args){

	int rows;


	Scanner reader = new Scanner(System.in);
	System.out.print("How many rows would you like? (Of Pascal's triangle)  ");
	rows = reader.nextInt();
	int col = rows;
	
	int [] [] yourpasc = new int [rows] [10];
			
	int x1 = rows + 2, y1 = rows;
	int [] [] rowNum = new int [x1] [10];
	int x = 0;
	int y = 0;
	
	int start = 1;
	
	
	
	
	
	
	while(y <= rows){

		while(x + 2 > y)
		{	
	
			if(y == 0 || y == x + 2)
			{
				rowNum[x] [y] = start;
			}
			else if(y == 1 && x ==1)
			{
				rowNum[x] [y] = 1;
			}
			else if((y == 2) && (x == 1 || x ==2))
			{
				rowNum [x] [y] = (rowNum [0] [0]) + 1;
			}
			else
			{
				rowNum[x] [y] = (rowNum [x-1] [y]) + (rowNum [x-1] [y-1]);
			}
			
			x++;
		}

		y = 0;
		y++;
	}
	
	
	System.out.println(rowNum);
	
	
	
	
	
	
	
	
	
	
	
	//yourpasc = pascal(rows);


	//System.out.println(yourpasc[0] [0]);

	//String debug = debug(rows);
	//System.out.println(debug);









	}


//public static int [] [] pascal(int rows){
	
	
	
	
	
	
	
	//return(rowNum);


//}


/*public static String debug(int rows){
	int x1 = rows + 2, y1 = rows;
	int [] [] rowNum = new int [x1] [y1 + 2];
	int x = 0;
	int y = 0;
	
	int start = 1;
	
	String debug = "";
	
	
	
	
	while(x > x1 || x1 == x){

		while(x + 2 >= y)
		{	
	
			if(x == 0 || x == y + 2)
			{
				rowNum[x] [y] = start;
			}
			else if(y == 1 && x ==1)
			{
				rowNum[x] [y] = (rowNum [0] [0]) + 1;
			}
			else
			{
			rowNum[x] [y] = (rowNum [x-1] [y]) + (rowNum [x-1] [y-1]);
			}
			
			y++;
			debug = "y:" + y;
		}

		y = 0;
		x++;
	}
	
	
	
	
	
	
	return(debug);


}
	
*/


}



	