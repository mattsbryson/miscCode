//import TurtleGraphics.Pen;
//import TurtleGraphics.StandardPen;


public class shape1 {

	public static void main(String[] args) {
		Wheel w1 = new Wheel(4, 4, 4, 4);
		
		System.out.println(w1.toString());
		
		
		
		Circle c1 = new Circle(2, 2, 2);
		
		Rect r1 = new Rect(4, 4, 4, 4);
		System.out.println(r1.toString());
		System.out.println(r1.perimeter());
		System.out.println(c1.toString());
		
		//StandardPen pen = new StandardPen();
		
		//c1.draw(pen);
		
	}

}
