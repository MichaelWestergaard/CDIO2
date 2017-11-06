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
		
		while(Player1.getAccount().getBalance() < 3000 && Player2.getAccount().getBalance() < 3000) {
			playTurn();
			showScore();
			
			if(Player1.getAccount().getBalance() >= 3000 || Player2.getAccount().getBalance() >= 3000) {
				if(Player1.getAccount().getBalance() > Player2.getAccount().getBalance()) {
					System.out.println(Player1.getName() + " vandt med " + Player1.getAccount().getBalance() + " point");
				} else {
					System.out.println(Player2.getName() + " vandt med " + Player2.getAccount().getBalance() + " point");
				}
			} else {
				System.out.println("Tryk [ENTER] for at skifte tur");
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
					System.out.println("Du opdager ruinerne af et tårn, hvori du finder nogle forhistoriske artefakter. Du får 250 point.");
					break;

				case 3:
					currentPlayer.getAccount().setBalance(-100);
					System.out.println("På din rejse passerer du et krater, hvor en radioaktivt isotop har ramt jorden. Du bliver udsat for stråling og mister 100 point");			
					break;

				case 4:
					currentPlayer.getAccount().setBalance(100);
					System.out.println("En af paladsets portvagter beder dig løbe et ærinde og betaler dig 100 point.");			
					break;
				
				case 5:
					currentPlayer.getAccount().setBalance(-20);
					System.out.println("Du trodser det kolde ørkenklima, men mister 20 point.");			
					break;
				
				case 6:
					currentPlayer.getAccount().setBalance(180);
					System.out.println("Da du er på vej ind af byens port, ser du en adelsmand tabe sin pung. Du finder 180 point.");			
					break;
				
				case 7:
					currentPlayer.getAccount().setBalance(0);
					System.out.println("Du overnatter på et kloster og vågner veludhvilet.");			
					break;
				
				case 8:
					currentPlayer.getAccount().setBalance(-70);
					System.out.println("Du begiver dig ind i en mørk og dyster grotte, men vender straks om da du hører skrig fra grottens dyb. Du kan mærke øjne der observerer dig og mister 70 point.");			
					break;
				
				case 9:
					currentPlayer.getAccount().setBalance(60);
					System.out.println("Du jager en bjørn i en afsides bjergby og beboerne belønner dig 60 point.");			
					break;
				
				case 10:
					i--;
					currentPlayer.getAccount().setBalance(-80);
					System.out.println("En vinternat hvor fuldmånen står højt på himlen runder du et skovbryn, "
							+ " og ser pludselig en enorm mur indhyllet i tåge, hvorpå grotekse og forvredne ulveskikkelser patruljerer "
							+ "Du gnider febrilsk øjnene, og da du åbner dem igen befinder du dig i din lejr fra i morges. "
							+ "Du mister 80 point, men får en ekstra tur.");	
					break;
				
				case 11:
					currentPlayer.getAccount().setBalance(-50);
					System.out.println("Du ser en fordybning i jorden, men da du læner dig ind over hullet taber du din hat og mister 50 point.");			
					break;
				
				case 12:
					currentPlayer.getAccount().setBalance(650);
					System.out.println("Du finder guld i bjergene, sælger det, og tjener 650 point.");			
					break;
				
				default:
					System.out.println("Ugyldigt terningekast");
					break;
			}
		
		
		}
	}
	
	public void playTurn() {
		
		if(turn == 1) {
			System.out.println(" --- " + Player1.getName() + "s tur --- ");
			rollDice();
			
			turn = 2; //Skifter tur
		} else if(turn == 2){
			System.out.println(" --- " + Player2.getName() + "s tur --- ");
			
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
		System.out.println("Pengebeholdning:");
		System.out.print(Player1.getName() + ": " + Player1.getAccount().getBalance());
		System.out.print(" | ");
		System.out.print(Player2.getName() + ": " + Player2.getAccount().getBalance());
		System.out.println();
		System.out.println("-------------------------------------");
	}
		
}