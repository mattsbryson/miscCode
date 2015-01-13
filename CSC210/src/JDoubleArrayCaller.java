import java.util.Scanner;


public class JDoubleArrayCaller 
{
	public static void main(String[] args) 
	{
		int [] [] LocalArray;
		int C, R, I;
		Scanner MyInput;
		MyInput = new Scanner(System.in);
		System.out.print("Please enter the number of Rows: ");
		C = MyInput.nextInt();
		System.out.print("Please enter the number of Collumns: ");
		R = MyInput.nextInt();
		System.out.print("Please enter the length of digits: ");
		I = MyInput.nextInt();
		
		
		
		JDoubleDimension One = new JDoubleDimension(C,R,I);
		LocalArray = One.getArray();
		
		
		
		
		One.SortCollumn();
		
		
		int x = 0, y = 0;
		while(x < One.getCollumn())
		{
			y = 0;
			while(y < One.getRow())
			{
				System.out.format("%2d ",LocalArray[x][y]);
				y++;
			}
			System.out.format("%2d ",	One.RowLargestNum		(x));
			System.out.format("%2d ",	One.RowSmallestNum		(x));
			System.out.format("%4.1f ",	One.RowAverage			(x));
			System.out.format("%4.1f ",	One.RowMedian			(x));
			System.out.format("%4.1f ",	One.RowStandardDeviance	(x));
			
			
			x++;
			System.out.print("\n");
		}
		
	}
		
		
	

}
