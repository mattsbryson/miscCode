
public class suv extends truck {

	Boolean suv;
	String nSuv;
	
	public suv() {
		super();
		suv = null;
		nSuv = "";
	}

	public suv(Boolean v, String t, Boolean tr, String nt, Boolean s, String nS) {
		super(v, t, tr, nt);
		suv = s;
		nSuv = nS;
	}
	
	public void setSuv(Boolean s){
		suv = s;
	}
	
	public void setNsuv(String nS){
		nSuv = nS;
	}
	
	public Boolean getSuv(){
		return suv;
	}
	
	public String getNsuv(){
		return nSuv;
	}

}
