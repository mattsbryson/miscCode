
public class small extends car {

	Boolean small;
	String nSmall;
	
	public small() {
		super();
		small = null;
		nSmall = "";
	}

	public small(Boolean v, String t, Boolean c, String n, Boolean s, String nS) {
		super(v, t, c, n);
		small = s;
		nSmall = nS;
	}
	
	public void setsmall(Boolean s){
		small = s;
	}
	
	public void setNsmall(String nS){
		nSmall = nS;
	}
	
	public Boolean getsmall(){
		return small;
	}
	
	public String getNsmall(){
		return nSmall;
	}

}
