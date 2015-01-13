import TurtleGraphics.Pen;

public class Wheel extends Circle {

	private int spokes;
	private double perm = super.perimeter();
	
	public Wheel() {
		super();
		spokes = 0;
	}

	public Wheel(double xLoc, double yLoc, double r, int s) {
		super(xLoc, yLoc, r);
		spokes = s;
	}
	
	public void draw(Pen p){
		super.draw(p);
		
		for(int i = 1; i <= spokes; i++){
			p.up();
			p.move(xPos, yPos);
			p.setDirection(i * 360.0 * spokes);
			p.down();
			p.move(radius);
		}
	}

	public void setSpokes (int s){
		spokes = s;
	}
	
	
	public String toString(){
		String str = "CIRCLE\n" + "Radius: " + radius + "\n" + "Spokes: " + spokes + "\n" + "Perimeter: " + perm + "\n" + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" + " Area: " + area();
		return str;
	}
	
	
}
