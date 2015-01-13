import java.util.InputMismatchException;
import java.util.Random;

public class JDoubleDimension {

	public JDoubleDimension(){}
	
	public JDoubleDimension(int c, int r, int D)
	{
		DigitLength = D;
		Digit = SetRandomDigitLength(D);
		Row = r;
		Collumn = c;
		Random RandomGen = new Random();
		int x = 0, y = 0;
		Array = new int [c] [r];
		while(x < c)
		{
			y = 0;
			while(y < r)
			{
				
				Array [x] [y] = RandomGen.nextInt(Digit);
				y++;
			}
			x++;
		}
	}
	
	//mutators 
	
	int SetRandomDigitLength(int A)
	{
		DigitLength = A;
		if(!(DigitLength < 1))
		{
			return Digit = (int) Math.pow(10 , DigitLength);
		}
		else
		{
			throw new InputMismatchException();
		}
	}
	
	void SetRow(int A)
	{
		Row = A;
	}
	
	void SetCollumn(int A)
	{
		Collumn = A;
	}
	
	void SetCellValue(int R, int C, int V)
	{
		Array [C] [R] = V;
	}
	
	void SetRandomDigit(int A)
	{
		Digit = A;
	}
	
	//accessors
	
	int getRow()		{ return Row; 			}
	int getCollumn()	{ return Collumn; 		}
	int getDigitLength(){ return DigitLength; 	}
	int getDigit() 		{ return Digit; 		}
	int getCellValue(int R, int C)
	{
		return Array [R] [C];
	}
	
	int [] [] getArray()
	{
		return Array;
	}
	
	//facilitators
	int[][] SortRow(int C)
	{
		int i = 0;
		int B = 0, A, Z;
		while(true)
		{
			Z = 0;
			i = 0;
			while(i < Row)
			{
				A = Array [C] [i];
				if(i + 1 < Row)
				{
					B = Array [C] [i + 1];
				}
				else
				{
					break;
				}
				
				if(A > B)
				{
					Array [C] [i] = B; 
					if(i + 1 < Collumn)
					{
						Array [C] [i + 1] = A;
					}	
					Z++;
				}
				i++;
			}
			if(Z == 0)
			{
				break;
			}
		}
		return Array;
	}
	
	int [] [] SortCollumn()
	{
		int i = 0, y = 0, t = 0;
		int B = 0, A, Z = 0;
		int [] aArray, bArray;
		
		while(y < Collumn)
		{
			SortRow(y);
			y++;
		}
		
		while(true)
		{
			i = 0;
			Z = 0;
			while(i < Collumn)
			{
				Z = 0;
				A = Array [i] [0];
				if(i + 1 < Collumn)
				{
					B = Array [i + 1] [0];
				}
				else
				{
					break;
				}
				aArray = Array[i];
				bArray = Array[i + 1];
				if(A > B)
				{
					Array[i + 1] = aArray;
					Array[i] = bArray;
					Z++;
				}
				
				int k = 1;
				while(A == B && k < Row)
				{
					A = Array [i] [k];
					B = Array [i + 1] [k];
					if(A > B)
					{
						Array[i + 1] = aArray;
						Array[i] = bArray;
						break;
					}
					k++;
				}
				
			   
				if(A == B && 1 < Row)
				{
					A = Array [i] [1];
					B = Array [i + 1] [1];
					if(A > B)
					{
						Array[i + 1] = aArray;
						Array[i] = bArray;
					}
					
				}
				
				i++;
			}
			if(Z == 0)
			{
				t++;
			}
			if(Z == 0 && t == 30)
			{
				break;
			}
			
		}
		return Array;
	}
	
	
	
	double RowMedian(int c)
	{
		if(Collumn % 2 == 0 || Collumn == 1)
		{
			return Array [c] [Row/2];
		}
		else
		{
			return Array [c] [(int)Row/2];
		}
	}
	
	double RowAverage(int c)
	{
		double Sum = 0;
		int i   = 0;
		while(i < Row)
		{
			Sum += Array[c][i];
			i++				;
		}
		return Sum/Collumn;
	}
	
	double RowVariance(int c)
	{
		double Avg = RowAverage(c);
		int i = 0;
		int Sum = 0;
		while(i < Row)
		{
			Sum += Math.pow((Array [c][i] - Avg), 2);
			i++;
		}
		return Sum/Row;
	}
	
	double RowStandardDeviance(int c)
	{
		return Math.sqrt(RowVariance(c));
	}
	
	int RowSmallestNum(int c)
	{
		int[][] Temp;
		Temp = SortRow(c);
		return Temp [c][0];
	}
	
	int RowLargestNum(int c)
	{
		int[][] Temp;
		Temp = SortCollumn();
		return Temp [c] [Row - 1];
	}
	
	
	
		
		
		
	
	
	private int Row, Collumn;
	private int [] [] Array;
	private int DigitLength;
	private int Digit;
	
}
