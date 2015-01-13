
public abstract class truck extends vehicle {

	Boolean truck;
	String nTruck;
	
	public truck() {
		super();
		truck = null;
		nTruck = "";
		
	}

	public truck(Boolean v, String t, Boolean tr, String nt) {
		super(v, t);
		truck = tr;
		nTruck  = nt;
	}

	public void setTruck(Boolean t){
		truck = t;
	}
	
	public void setnTruck(String t){
		nTruck = t;
	}
	
	public Boolean getTruck(){
		return truck;
	}
	
	public String getnTruck(){
		return nTruck;
	}
}
