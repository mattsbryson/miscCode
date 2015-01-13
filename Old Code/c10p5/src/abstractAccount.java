
public abstract class abstractAccount implements bank {

	protected double balance;
	
	public abstractAccount(){
		balance = 0;

	}
	
	public abstractAccount(double b){
		balance = b;
	}
	
	public void deposit(double d) {
		balance += d;

	}

	
	public void withdraw(double w) {
		balance -= w;

	}
	
	public double getBalance(){
		return balance;
	}
	
	public String toString(){
		String str = " Balance: " + balance;
		return str;
		
	}
	
}
