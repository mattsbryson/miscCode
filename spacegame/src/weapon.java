
public class weapon {

	int damage;
	int powerReq; 
	int range;
	String direction;
	
	
	
	public weapon(){
		damage = 0;
		powerReq = 0;
		range = 0;
		direction = "";
	} 
	
	/*public weapon(int d, int p, int r){
		damage = d;
		powerReq = p;
		range = r;
	} */
	
	public int getDamage(){
		return damage;
	}
	
	public int powerReq(){
		return powerReq;
	}
	
	public int range(){
		return range;
	}
	
	public void setDir(String d){
		direction = d;
	}
	
	public String getDir(){
		return direction;
	}
	
}
