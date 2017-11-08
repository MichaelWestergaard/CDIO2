package Game;

public class Account {

	private int balance = 1000;
	
	public void setBalance(int points) {
		if(balance + points < 0) {
			balance = 0;
		} else {
			balance += points;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
