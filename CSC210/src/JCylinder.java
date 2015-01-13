
public class JCylinder {

	public JCylinder(){}
	
	public JCylinder(double R, Double H)
	{
		Radius = R;
		Height = H;
	}
	
	//mutators
	
	void setRadius(double R)
	{
		Radius = R;
	}
	
	void setHeight(double R)
	{
		Height = R;
	}
	
	//accessors
	
	double getRadius()
	{
		return Radius;
	}
	
	double getHeight()
	{
		return Height;
	}
	
	//facilitators
	
	double Diameter()
	{
		return Radius * 2;
	}
	
	double SurfaceArea()
	{
		return (2 * Math.PI * Math.pow(Radius, 2)) + (2 * Math.PI * Radius * Height);
	}
	
	double Volume()
	{
		return Math.PI * Math.pow(Radius, 2) * Height;
	}
	
	private double Radius, Height;
	
}
