
public class flatbed extends truck {

	Boolean flatBed;
	String nFlatbed;
	
	public flatbed() {
		super();
		flatBed = null;
		nFlatbed = "";
		
	}

	public flatbed(Boolean v, String t, Boolean tr, String nt, Boolean f, String nf) {
		super(v, t, tr, nt);
		flatBed = f;
		nFlatbed = nf;
	}

	public void setFlatbed(Boolean f){
		flatBed = f;
	}
	
	public void setNflatbed(String nf){
		nFlatbed = nf;
	}
	
	public Boolean getflatBed(){
		return flatBed;
	}
	
	public String getNflatBed(){
		return nFlatbed;
	}
	
}
