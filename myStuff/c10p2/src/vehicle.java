
public abstract class vehicle {

	Boolean vehicle;
	String type;
	
	public vehicle(){
		vehicle = null;
		type = null;
		
		
	}
	
	public vehicle(Boolean v, String t){
		vehicle = v;
		type = t;
		
	}
	
	public void setVehicle(Boolean v){
		vehicle = v;
	}

	public String getType(){
		return type;
	}
	
	public Boolean getVehicle(){
		return vehicle;
	}
}
