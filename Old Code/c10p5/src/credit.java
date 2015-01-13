
public class credit extends abstractAccount {

	protected double intRate, maxAm;
	public credit() {
		super();
		intRate = 0;
		maxAm = 0;
	}

	public credit(double b, double iR, double m) {
		super(b);
		intRate = iR;
		maxAm = m;
	}
	
	public void interest(double i){
		intRate = i;
	}
	
	public double getMax(){
		return maxAm;
	}

	public String toString(){
		String Str = "Max Amount: " + maxAm + " Interest Rate: " + intRate + super.toString();
		return Str;
	}

}
