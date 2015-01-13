import TurtleGraphics.Pen;


public abstract class AbstractShape implements Shape {

	protected double xPos;
	protected double yPos;
	
	public AbstractShape(){
		xPos = 0;
		yPos = 0;
	}
	
	public AbstractShape(double xLoc, double yLoc){
		xPos = xLoc;
		yPos = yLoc;
	}
	
	
	abstract public double area();

	abstract public void draw(Pen p);

	public double getXPos() {
		return xPos;
	}

	public double getYPos() {
		return yPos;
	}

	public void move(double xLoc, double yLoc) {
		xPos = xLoc;
		yPos = yLoc;
	}

	abstract public void stretchBy(double factor);
	
	abstract public double perimeter();
	
	public String toString(){
		String str = "(X,Y) Position: (" + xPos + "," + yPos + ")\n" + " Area: " + area()+ "\n" + "Perimeter: " + perimeter();
		return str;
	}

}
