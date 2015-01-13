abstract public class kingdom{

	String kingdom;
	
	public kingdom(){
		this(""); //default
	}
	
	public kingdom(String k){
		kingdom = k;
	}

	public void setKing(String sK){
		kingdom = sK;
	}

	public String getKing(){
		return kingdom;
	}
	
	public String toString(){
		String a = "Kingdom: " + kingdom;
		return a;
	}
	

	abstract public void setGenus(String G);	
	abstract public String getGenus();
	abstract public void setPhylum(String g);	
	abstract public String getPhylum();


}
	














