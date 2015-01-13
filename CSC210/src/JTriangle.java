public class JTriangle 
{
	//default constructor 
	public JTriangle(){}

	
	//full constructor
	public JTriangle(double A, double B, double C)
	{
		SideA = A;
		SideB = B;
		SideC = C;
	}
	
	//mutators
	void setSideA(double A)
	{
		SideA = A;
	}
	
	void setSideB(double A)
	{
		SideB = A;
	}
	
	void setSideC(double A)
	{
		SideC = A;
	}
	
	//accessors
	double getSideA()
	{
		return SideA;
	}
	
	double getSideB()
	{
		return SideB;
	}
	
	double getSideC()
	{
		return SideC;
	}
	
	//facilitators 
	
	double Perimeter()
	{
		return SideA + SideB + SideC;
	}
	
	//using Heron's formula
	double Area()
	{
		double Area, sideSum;
		sideSum = (SideA + SideB + SideC) / 2;
		Area = Math.sqrt(sideSum * (sideSum - SideA) * (sideSum - SideB) * (sideSum - SideC));
		return Area;
	}
	
	double Altitude(String A)
	{
		double Area = Area();
		if(A.equalsIgnoreCase("SideA"))
		{
			 return (2 * Area) / SideA;
		}
		else if(A.equalsIgnoreCase("SideB"))
		{
			return (2 * Area) / SideB;
		}
		else if(A.equalsIgnoreCase("SideC"))
		{
			return (2 * Area) / SideC;
		}
		else
		{
			return -1; 
		}
	}
	
	double AltitudeSideA()
	{
		double Area = Area();
		return (2 * Area) / SideA;
	}
	
	double AltitudeSideB()
	{
		double Area = Area();
		return (2 * Area) / SideB;
	}
	
	double AltitudeSideC()
	{
		double Area = Area();
		return (2 * Area) / SideC;
	}
	
	double angleA()
	{
		double angle;
		angle = Math.acos((SideB * SideB + SideC * SideC - SideA * SideA) / (2 * SideB * SideC));
		return Math.toDegrees(angle);
	}
	
	double angleB()
	{
		double angle;
		angle = Math.acos((SideA * SideA + SideC * SideC - SideB * SideB) / (2 * SideA * SideC));
		return Math.toDegrees(angle);
	}
	
	double angleC()
	{
		double angle;
		angle = Math.acos((SideB * SideB + SideA * SideA  - SideC * SideC) / (2 * SideA * SideB));
		return Math.toDegrees(angle);
	}

	
	//variables declared
	private double SideA, SideB, SideC;
}

