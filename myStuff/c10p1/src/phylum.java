public class phylum extends genus{
	
	String phylum;
	
	public phylum(){
		super();
		phylum = "";
	}

	public phylum(String kingdom, String g, String g2){
		super(kingdom, g);	
		phylum = g2;
	}

	public void setPhylum(String g){
		phylum = g;
	}

	public String getPhylum(){
		return phylum;
	}

	public String toString(){
		String a = "Kingdom: " + kingdom + " Genus: " + genus + " Phylum: " + phylum;
		return a;
	}

	



}