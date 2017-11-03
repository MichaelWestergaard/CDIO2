package Game;
import java.util.Scanner;

import Game.Dice;


public class Game {
	
	static int turn = 0;
	static Dice Dice= new Dice();

	
	public static void nextTurn(int turn) {
		if(turn % 2 == 0) {
			Dice.rollDice();
			System.out.print( Player1.getName()  + " slog: " + Dice.getSum());
			Player1.addPoints(Dice.getSum());
			
		} else {
			Dice.rollDice();
			System.out.println(Player2.getName()  + " slog: " + Dice.getSum());
			Player2.addPoints(Dice.getSum());

			showScore();
			System.out.println();
			System.out.println("Tryk [ENTER] for at gå til næste runde");
		}
		Game.turn++;
	}
	
	public static void pressEnter() {
		Scanner input = new Scanner(System.in);
		input.hasNextLine();
	}
	
}
