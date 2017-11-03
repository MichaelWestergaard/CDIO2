package Game;

public class Dice {

	private int dice;
	private int sum;	
	
	public void rollDice() {
		dice = (int)(Math.random()*6) + 1; //Terning 1 sættes til at være 1-6
		//dice2 = (int)(Math.random()*6) + 1; //Terning 2 sættes til at være 1-6
		diceSum();
	}
	
	public void diceSum() {
		sum = dice + dice; //Finder summen af de to terninger
	}

	public boolean getEns() {
		if(dice == dice) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getSum() {
		return sum;
	}
	
}



