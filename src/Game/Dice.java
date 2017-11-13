package Game;

public class Dice {

	private int faceValue;
	private int diceside = 6;
	
	public void rollDice() {
		faceValue = (int)(Math.random()*diceside) + 1; //Terning 1 sættes til at være 1-6
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
}