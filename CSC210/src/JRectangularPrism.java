
public class JRectangularPrism {

	public JRectangularPrism(){}
	
	public JRectangularPrism(double L, double W, double H)
	{
		Mars = L;
		Earth =  W;
		Venus = H;
	}
	
	void setMars(double A)
	{
		Mars = A;
	}
	
	void setEarth(double A)
	{
		Earth = A;
	}
	
	void setVenus(double A)
	{
		Earth = A;
	}
	
	double getMars(){ return Mars;		 }
	double getEarth (){ return Earth ;   }
	double getVenus(){ return Venus; 	 }
	
	//facilitators 
	
	double SurfaceArea()
	{
		double SideA, SideB, SideC;
		SideA = Mars * Earth;
		SideB = Earth * Venus;
		SideC = Venus * Mars;
		return 2 * (SideA + SideB + SideC);
	}
	
	double Volume()
	{
		return Mars * Earth * Venus; 
	}
	
	double shortestDiagonal()
	{
		return Math.sqrt(Venus * Venus + Earth * Earth);
	}
	
	double middleDiagonal()
	{
		return Math.sqrt(Venus * Venus + Mars * Mars);
	}
	
	double largestDiagonal()
	{
		return Math.sqrt(Mars * Mars + Earth * Earth);
	}
	
	double internalDiagonal()
	{
		return Math.sqrt( Math.pow(Mars, 2) + Math.pow(Earth, 2) + Math.pow(Venus, 2));
	}
	
	private double Mars, Earth, Venus; 
}
