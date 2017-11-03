package Game;

import Game.Dice;
import java.util.Scanner;
import Game.Player;


public class Game {
	
	static int turn = 0;
	static Dice Dice= new Dice();
	static Player Player1, Player2;

	public static void indtastName() {
	Scanner name = new Scanner(System.in);
	
	System.out.println("Spiller 1 vælger sit navn");
	Player1 = new Player(name.nextLine());

	System.out.println("Spiller 2 vælger sit navn");
	Player2 = new Player(name.nextLine());
	
	System.out.println("Tryk [ENTER] for at starte spillet");
	pressEnter();
	
	}

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
	
			showScore();
			System.out.println();
			System.out.println("Tryk [ENTER] for at gå til næste runde");
		}
		Game.turn++;
	}
	
