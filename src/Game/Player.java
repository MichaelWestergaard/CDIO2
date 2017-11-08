package Game;

public class Player {

	private String name;
	private Account account = new Account();
	
	public Player (String name) {
		this.name = name;
	}
	
	public void addPoints(int points) {
		account.setBalance(points);
	}
	
	public int getPoints() {
		return account.getBalance();
	}

	public String getName() {
		return name;
	}
	
}
