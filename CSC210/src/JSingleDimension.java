import java.util.Random;


public class JSingleDimension
{

	public JSingleDimension(){}
	
	public JSingleDimension(int S)
	{
		int i = 0;
		int RanNum;
		Random RandomGen = new Random();
		ArraySize = S;
		Single = new int [ArraySize];
		
		while(i < ArraySize)
		{
			RanNum = RandomGen.nextInt(10);
			//if(RanNum > 9 && RanNum < 100)
			//{
				Single [i] = RanNum;
				i++;
			//}
		}
	}
	
	//mutators
	
	void setSize(int S)
	{
		ArraySize = S;
	}
	
	void setArray(int S)
	{
		int i = 0;
		ArraySize = S;
		Single = new int [ArraySize];
		
		while(i < ArraySize)
		{
			Single [i] = 0;
			i++;
		}
	}
	
	void setArrayRandom(int S)
	{
		int i = 0;
		int RanNum;
		Random RandomGen = new Random();
		ArraySize = S;
		Single = new int [ArraySize];
		
		while(i < ArraySize)
		{
			RanNum = RandomGen.nextInt(1000);
			if(RanNum > 99 && RanNum < 1000)
			{
				Single [i] = RanNum;
				i++;
			}
		}
	}
	
	//accessors
	
	int getSize()
	{
		return ArraySize;
	}
	
	int [] getArray()
	{
		return Single;
	}
	
	//facilitators
	
	int [] SortedArray()
	{
		int i = 0;
		int B = 0, A, Z;
		while(true)
		{
			Z = 0;
			i = 0;
			while(i < ArraySize)
			{
				A = Single [i];
				if(i + 1 < ArraySize)
				{
					B = Single [i + 1];
				}
				else
				{
					break;
				}
				
				if(A > B)
				{
					Single [i] = B; 
					if(i + 1 < ArraySize)
					{
						Single [i + 1] = A;
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
		return Single;
	}
	
	double Median()
	{
		if(ArraySize % 2 == 0)
		{
			return (Single[ArraySize/2] + Single[(ArraySize/2 - 1)]) / 2.0;
		}
		else
		{
			return Single[(int)ArraySize/2];
		}
	}
	
	double Average()
	{
		double Sum = 0;
		int i   = 0;
		while(i < ArraySize)
		{
			Sum += Single[i];
			i++				;
		}
		return Sum/ArraySize;
	}
	
	double Variance()
	{
		double Avg = Average();
		int i = 0;
		int Sum = 0;
		while(i < ArraySize)
		{
			Sum += Math.pow((Single[i] - Avg), 2);
			i++;
		}
		return Sum/ArraySize;
	}
	
	double StandardDeviance()
	{
		return Math.sqrt(Variance());
	}
	
	int SmallestNum()
	{
		int [] Temp;
		Temp = SortedArray();
		return Temp[0];
	}
	
	int LargestNum()
	{
		int [] Temp;
		Temp = SortedArray();
		return Temp[ArraySize - 1];
	}
	
	
	private int ArraySize;
	private int [] Single;
	
	
	
}
