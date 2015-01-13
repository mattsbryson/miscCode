public class animal1{

	public static void main (String [] args){

		phylum a1 = new phylum("king", "genus", "grade");
	
		
		String k1 = a1.getKing();
		String g1 = a1.getGenus();
		String g2 = a1.getPhylum();
		//String p = phylum.toString();
		System.out.println(k1 + " " + g1 + " " + g2);
		
		//System.out.println(phylum.toString());

	}

}