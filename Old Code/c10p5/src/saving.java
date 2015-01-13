
public class saving extends abstractAccount {

	protected double intRate;
	
	
	public saving() {
		super();
		intRate = 0;
	}

	public saving(double b, double iR) {
		super(b);
		intRate = iR;
	}
	
	public void interest(double i){
		intRate = i;
	}
	
	public String toString(){
		String Str = "Interest Rate: " + intRate + super.toString();
		return Str;
	}
	
	

}
