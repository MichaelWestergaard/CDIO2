package Game;

import Game.Dice;

import java.util.Map;
import java.util.Scanner;
import Game.Player;

public class Game {
	
	int turn = 1; //Turn = 1 - Player 1s turn || Turn = 2 - Player 2s turn
	boolean gameStarted = false;
	public Map<String, String> gameText;
	
	
	public Dice dice1, dice2;
	public Player Player1, Player2;
	
	
	
	public void gameSetup(){
		
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
	
	public void playGame() {
		
		if(gameStarted == false) {
			gameSetup();
		}
		
		while(Player1.getAccount().getBalance() < 3000 && Player2.getAccount().getBalance() < 3000) {
			playTurn();
			showScore();
			
			if(Player1.getAccount().getBalance() >= 3000 || Player2.getAccount().getBalance() >= 3000) {
				if(Player1.getAccount().getBalance() > Player2.getAccount().getBalance()) {
					System.out.println(String.format(gameText.get("vinderTekst"), Player1.getName(), Player1.getAccount().getBalance()));
				} else {
					System.out.println(String.format(gameText.get("vinderTekst"), Player2.getName(), Player2.getAccount().getBalance()));
				}
			} else {
				System.out.println(gameText.get("næsteTur"));
				pressEnter();
			}
		}
		
	}
	
	public void rollDice() {
		int sum = 0;
		
		Player currentPlayer = null;
		if(turn == 1) {
			currentPlayer = Player1;
		} else if(turn == 2) {
			currentPlayer = Player2;
		}
		
		for(int i=0; i<1; i++) {
			dice1.rollDice();
			dice2.rollDice();	
			sum = dice1.getFaceValue() + dice2.getFaceValue();
			
			switch(sum) { //Afgører hvilket felt man lander på.
				case 2:
					currentPlayer.getAccount().setBalance(250);
					System.out.println(gameText.get("felt2"));
					break;

				case 3:
					currentPlayer.getAccount().setBalance(-100);
					System.out.println(gameText.get("felt3"));			
					break;

				case 4:
					currentPlayer.getAccount().setBalance(100);
					System.out.println(gameText.get("felt4"));			
					break;
				
				case 5:
					currentPlayer.getAccount().setBalance(-20);
					System.out.println(gameText.get("felt52"));			
					break;
				
				case 6:
					currentPlayer.getAccount().setBalance(180);
					System.out.println(gameText.get("felt6"));			
					break;
				
				case 7:
					currentPlayer.getAccount().setBalance(0);
					System.out.println(gameText.get("felt7"));			
					break;
				
				case 8:
					currentPlayer.getAccount().setBalance(-70);
					System.out.println(gameText.get("felt8"));			
					break;
				
				case 9:
					currentPlayer.getAccount().setBalance(60);
					System.out.println(gameText.get("felt9"));			
					break;
				
				case 10:
					i--;
					currentPlayer.getAccount().setBalance(-80);
					System.out.println(gameText.get("felt10"));	
					break;
				
				case 11:
					currentPlayer.getAccount().setBalance(-50);
					System.out.println(gameText.get("felt11"));			
					break;
				
				case 12:
					currentPlayer.getAccount().setBalance(650);
					System.out.println(gameText.get("felt12"));			
					break;
				
				default:
					System.out.println(gameText.get("ugyldigtFelt"));
					break;
			}

		}
	}
	
	public void playTurn() {
		
		if(turn == 1) {
			System.out.println(String.format(gameText.get("playerTurn"), Player1.getName()));
			rollDice();
			
			turn = 2; //Skifter tur
		} else if(turn == 2){
			System.out.println(String.format(gameText.get("playerTurn"), Player2.getName()));
			
			rollDice();
			
			turn = 1; //Skifter tur
		}
		
	}
		
	public void pressEnter() {
		Scanner input = new Scanner(System.in);
		input.hasNextLine();
	}
	
	public void showScore() {
		System.out.println("-------------------------------------");
		System.out.println(gameText.get("scoreText"));
		System.out.print(Player1.getName() + ": " + Player1.getAccount().getBalance());
		System.out.print(" | ");
		System.out.print(Player2.getName() + ": " + Player2.getAccount().getBalance());
		System.out.println();
		System.out.println("-------------------------------------");
	}
		
}