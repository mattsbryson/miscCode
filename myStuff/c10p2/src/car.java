
public abstract class car extends vehicle {
	
	Boolean car;
	String nCar;
	
	public car() {
		super();
		car = null;
		nCar = "";
	}

	public car(Boolean v, String t, Boolean c, String n){
		super(v, t);
		car = c;
		nCar = n;
	}
	
	public void setCar(Boolean c){
		car = c;
	}
	
	public void setNcar(String n){
		nCar = n;
	}
	
	public Boolean getCar(){
		return car;
	}
	
	public String getNcar(){
		return nCar;
	}
}
