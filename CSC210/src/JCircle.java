public class JCircle
{
	public JCircle(){}								//default constructor 1st
	
	void   setRadius (double A) { Radius = A					; 	} 	// mutator 3rd
	
	double getRadius (	      ) { return Radius					; 	} 	//accessor, must be after mutator 
	
	//beginning of facilitator
	double Diameter  	() 	{ return Radius * 2.0				; 	} 
	double Circumfrence () 	{ return Radius * 2.0 * Math.PI		; 	}	
	double Area 		()	{ return Math.sqrt(Radius) * Math.PI;	}
	
	
	
	
	
	
	
	
	private double Radius;
}
