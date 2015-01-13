
public class ship {
	
	int power;
	String name; 
	double forwardShield;
	double aftShield;
	double portShield;
	double starboardShield;
	double speed;
	double warpAct;
	int xloc;
	int yloc;
	double shieldRes;
	boolean computer;
	double hull;
	int hullRes;
	}
	
	public ship(String n, boolean p, int s, int wA, int x, int y, int sR, int hR){
		this();
		computer = p;
		name = n;
		speed = s;
		warpAct = wA;
		xloc = x;
		yloc = y;
		shieldRes = sR;
		hullRes = hR;
	}
	
	public void fShieldDamage(double damage){
		double shield;
		shield = forwardShield - (damage / shieldRes);
		if(shield > 0){
			forwardShield = shield;
		}
		else{
			double h;
			h = hull - (damage / hullRes);
			hull = h;
		}
		
	}
	
	public void aShieldDamage(double damage){
		double shield;
		shield = aftShield - (damage / shieldRes);
		if(shield > 0){
			aftShield = shield;
		}
		else{
			double h;
			h = hull - (damage / hullRes);
			hull = h;
		}
		
	}
	
	public void pShieldDamage(double damage){
		double shield;
		shield = portShield - (damage / shieldRes);
		if(shield > 0){
			portShield = shield;
		}
		else{
			double h;
			h = hull - (damage / hullRes);
			hull = h;
		}
		
	}
	
	public void sShieldDamage(double damage){
		double shield;
		shield = starboardShield - (damage / shieldRes);
		if(shield > 0){
			starboardShield = shield;
		}
		else{
			double h;
			h = hull - (damage / hullRes);
			hull = h;
		}
		
	}
	
	public double fShield(){
		return forwardShield;
	}
	
	public double aSheild(){
		return aftShield;
	}
	
	public double pShield(){
		return portShield;
	}
	
	public double sShield(){
		return starboardShield;
	}
	
	public double hull(){
		return hull;
	}
	
	public void powerUse(int pUse){
		power -= pUse;
	}
	
	public int power(){
		return power;
	}
	
	public void move(String dir){
		if(dir.equalsIgnoreCase("up")){
			yloc++;
		}
		else if(dir.equalsIgnoreCase("down")){
			yloc--;
		}
		else if(dir.equalsIgnoreCase("port") || dir.equalsIgnoreCase("right")){
			xloc++;
		}
		else if(dir.equalsIgnoreCase("starboard") || dir.equalsIgnoreCase("left")){
			xloc--;
		}
		else
			System.out.println("Ship Cannot Move In This Direction");
	}
	
	public void setY(int y){
		yloc = y;
	}
	
	public void setX(int x){
		xloc = x;
	}
	
	
	public int shipY(){
		return yloc;
	}
	
	public int shipX(){
		return xloc;
	}

	public boolean computer(){
		return computer;
	}
	
	public void name(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void weaponSet(String w, int i){
		if(w.equalsIgnoreCase("photon")){
			shipWeapons[i] = new photon(); 
		}
		else if(w.equalsIgnoreCase("laser")){
			shipWeapons[i] = new laser(); 
		}
		else if(w.equalsIgnoreCase("missle")){
			shipWeapons[i] = new missle(); 
		}
	}
	
	public weapon getWeapon(int i){
		return shipWeapons[i - 1];
	}
	
	public void weaponDset(String d, int i){
		shipWeapons[i].setDir(d);
	}
	
	public String getWeaponDir(int i){
		return shipWeapons[i].getDir();
	}
	
}
