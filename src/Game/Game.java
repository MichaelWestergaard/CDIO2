package Game;

import Game.Dice;

import java.util.Map;
import java.util.Scanner;
import Game.Player;

public class Game {

	int turn = 1; // Turn = 1 - Player 1s turn || Turn = 2 - Player 2s turn
	boolean gameStarted = false;
	public Map<String, String> gameText;

	public Dice dice1, dice2;
	public Player Player1, Player2;

	public void gameSetup() {

		Language lang = new Language();
		gameText = lang.languageSetup("Dansk.txt");

		Scanner input = new Scanner(System.in);

		dice1 = new Dice();
		dice2 = new Dice();

		System.out.println(gameText.get("vælgNavn1"));
		Player1 = new Player(input.nextLine());

		System.out.println(gameText.get("vælgNavn2"));
		Player2 = new Player(input.nextLine());

		System.out.println(gameText.get("spilStart"));
		pressEnter();
		gameStarted = true;
	}

	public void play() {

		if (gameStarted == false) {
			gameSetup();
		}

		while (Player1.getPoints() < 3000 && Player2.getPoints() < 3000) {
			playTurn();
			showScore();

			if (Player1.getPoints() >= 3000 || Player2.getPoints() >= 3000) {
				System.out.println(getWinner());
			} else {
				System.out.println(gameText.get("næsteTur"));
				pressEnter();
			}
		}

	}
	
	public String getWinner() {
		if (Player1.getPoints() > Player2.getPoints()) {
			return String.format(gameText.get("vinderTekst"), Player1.getName(), Player1.getPoints());
		} else {
			return String.format(gameText.get("vinderTekst"), Player2.getName(), Player2.getPoints());
		}
	}

	public int rollDices() {
		int sum = 0;
		int points = 0;

		for (int i = 0; i < 1; i++) {
			dice1.rollDice();
			dice2.rollDice();
			sum = dice1.getFaceValue() + dice2.getFaceValue();

			points = sumToPoints(sum);

			if (sum == 10) {
				i--;
			}

		}
		return points;
	}

	public int sumToPoints(int sum) {
		switch (sum) { // Afgører hvilket felt man lander på.
			case 2:
				System.out.println(gameText.get("felt2"));
				return 250;
			case 3:
				System.out.println(gameText.get("felt3"));
				return -100;
	
			case 4:
				System.out.println(gameText.get("felt4"));
				return 100;
	
			case 5:
				System.out.println(gameText.get("felt5"));
				return -20;
	
			case 6:
				System.out.println(gameText.get("felt6"));
				return 180;
	
			case 7:
				System.out.println(gameText.get("felt7"));
				return 0;
	
			case 8:
				System.out.println(gameText.get("felt8"));
				return -70;
	
			case 9:
				System.out.println(gameText.get("felt9"));
				return 60;
	
			case 10:
				System.out.println(gameText.get("felt10"));
				return -80;
	
			case 11:
				System.out.println(gameText.get("felt11"));
				return -50;
	
			case 12:
				System.out.println(gameText.get("felt12"));
				return 650;
	
			default:
				System.out.println(gameText.get("ugyldigtFelt"));
				return 0;
		}
	}

	public void playTurn() {

		Player currentPlayer = null;
		int points = 0;
		
		if (turn == 1) {
			System.out.println(String.format(gameText.get("playerTurn"), Player1.getName()));
			
			currentPlayer = Player1;
			points = rollDices();
			
			currentPlayer.addPoints(points);

			turn = 2; // Skifter tur
		} else if (turn == 2) {
			System.out.println(String.format(gameText.get("playerTurn"), Player2.getName()));
			
			currentPlayer = Player2;
			points = rollDices();
			
			currentPlayer.addPoints(points);

			turn = 1; // Skifter tur
		}

	}

	public void pressEnter() {
		Scanner input = new Scanner(System.in);
		input.hasNextLine();
	}

	public void showScore() {
		System.out.println("-------------------------------------");
		System.out.println(gameText.get("scoreText"));
		System.out.print(Player1.getName() + ": " + Player1.getPoints());
		System.out.print(" | ");
		System.out.print(Player2.getName() + ": " + Player2.getPoints());
		System.out.println();
		System.out.println("-------------------------------------");
	}

}