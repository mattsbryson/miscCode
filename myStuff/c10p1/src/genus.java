public abstract class genus extends kingdom{
	String genus;
	public genus(){
		super();
		genus = "";
	}

	public genus(String kingdom, String g){
		super(kingdom);	
		genus = g;
	}

	public void setGenus(String G){
		genus = G;
	}

	public String getGenus(){
		return genus;
	}


	/*public String toString(){
		String a = "Kingdom: " + kingdom + " Genus: " + genus;
		return a;
	}*/





}