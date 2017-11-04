package Game;

import Game.Dice;
import java.util.Scanner;
import Game.Player;


public class Game {
	
	int turn = 1; //Turn = 1 - Player 1s turn || Turn = 2 - Player 2s turn
	boolean gameStarted = false;
	
	public Dice dice1, dice2;
	public Player Player1, Player2;

	public void gameSetup(){
		Scanner input = new Scanner(System.in);
		
		dice1 = new Dice();
		dice2 = new Dice();
		
		System.out.println("Spiller 1 vælger sit navn");
		Player1 = new Player(input.nextLine());

		System.out.println("Spiller 2 vælger sit navn");
		Player2 = new Player(input.nextLine());
		
		System.out.println("Tryk [ENTER] for at starte spillet");
		pressEnter();
		gameStarted = true;
	}
	
	public void playGame() {
		
		if(gameStarted == false) {
			gameSetup();
		}
				
	}
	
	public void nextTurn() {
		int sum = 0;
		
		dice1.rollDice();
		dice2.rollDice();	
		sum = dice1.getFaceValue() + dice2.getFaceValue();
		
		if(turn == 1) {
			Player1.getAccount().setBalance(sum);
			turn = 2; //Skifter tur
		} else if(turn == 2){
			Player2.getAccount().setBalance(sum);
			turn = 1; //Skifter tur
		}
		
	}
		
	public void pressEnter() {
		Scanner input = new Scanner(System.in);
		input.hasNextLine();
	}
}