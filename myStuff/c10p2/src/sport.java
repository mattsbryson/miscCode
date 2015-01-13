
public class sport extends car {

	Boolean sport;
	String nSport;
	
	public sport() {
		super();
		sport = null;
		nSport = "";
	}

	public sport(Boolean v, String t, Boolean c, String n, Boolean s, String sN) {
		super(v, t, c, n);
		sport = s;
		nSport = sN;
	}

	public void setsport(Boolean s){
		sport = s;
	}
	
	public void setNsport(String nS){
		nSport = nS;
	}
	
	public Boolean getsport(){
		return sport;
	}
	
	public String getNsport(){
		return nSport;
	}
}
