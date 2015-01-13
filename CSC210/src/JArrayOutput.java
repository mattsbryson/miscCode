//////////////////////////////////////////////////////////
//Student Name: Matt Bryson			Beginnning Java		//
//Project Name 	JArrayOutput		CSC 210				//
//Comments		Array Tests			Fall of 2012		//
//									Engr R.M. Politio	//
//									October 15, 2012	//
//////////////////////////////////////////////////////////

public class JArrayOutput
{

	public static void main(String[] args)
	{
		System.out.println("\t\t\t  CALIFORNIA LUTHERAN UNIVERSITY			");
		System.out.println("\t\t\t  Department of Computer Science			");
		System.out.println("\n\t\t\t  CSC 210 - Fall 2012				    ");
		System.out.println("\t\t\t\t  Matt Bryson							");
		
		int i = 0;
		int [] LocalArray;
		JSingleDimension Alpha = new JSingleDimension(6);
		int Size = Alpha.getSize();
		
	
		//unsorted Array
		LocalArray = Alpha.getArray();
		System.out.print("\nUnsorted Array: ");
		while(i < Alpha.getSize()	)
		{
			if(i + 1 < Size)
			{
				System.out.print(LocalArray[i] + ", ");
			}
			else
			{
				System.out.print(LocalArray[i]		);
			}
			
			i++;
		}
		
		//sorted array
		i = 0;
		LocalArray = Alpha.SortedArray();
		System.out.print("\n\nSorted Array  : ");
		while(i < Alpha.getSize()	)
		{
			if(i + 1 < Size)
			{
				System.out.print(LocalArray[i] + ", ");
			}
			else
			{
				System.out.print(LocalArray[i]		);
			}
			
			i++;
		}
		
		//array stats
		System.out.print  ("\n\t\t\t   Array Size           = ");
		System.out.format ("%8d",      Alpha.getSize() 		   );
		System.out.print  ("\n\t\t\t   Largest Number       = ");
		System.out.format ("%8d",      Alpha.LargestNum() 	   );
		System.out.print  ("\n\t\t\t   Smallest Number      = ");
		System.out.format ("%8d",      Alpha.SmallestNum() 	   );
		System.out.print  ("\n\t\t\t   Average or Mean      = ");
		System.out.format ("%8.3f",    Alpha.Average() 		   );
		System.out.print  ("\n\t\t\t   Median               = ");
		System.out.format ("%8.3f",    Alpha.Median() 	   	   );
		System.out.print  ("\n\t\t\t   Variance             = ");
		System.out.format ("%8.3f",    Alpha.Variance()		   );
		System.out.print  ("\n\t\t\t   Standard Devaince    = ");
		System.out.format ("%8.3f",    Alpha.StandardDeviance());
		
		
		
		
		
		
		
		System.out.print("\n\n\n");

	}

}
