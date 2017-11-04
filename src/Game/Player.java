package Game;

public class Player {

	private String name;
	private Account account = new Account();
	
	public Player (String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}
	
}
