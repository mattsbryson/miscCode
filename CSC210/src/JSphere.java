
public class JSphere 
{

	public JSphere(){}
	
	public JSphere(double R)
	{
		Radius = R;
	}
	
	//mutators
	
	void setRadius(double R)
	{
		Radius = R;
	}
	
	//accessors
	
	double getRadius()
	{
		return Radius;
	}
	
	//facilitators
	
	double Diameter()
	{
		return Radius * 2;
	}
	
	double SurfaceArea()
	{
		return Math.pow(Radius, 2) * 4 * Math.PI;
	}
	
	double Volume()
	{
		return (4 / 3) * Math.PI * Math.pow(Radius, 3);
	}
	
	private double Radius;
}
