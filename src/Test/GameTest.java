package Test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.Game;
import Game.Language;
import Game.Player;

public class GameTest {

	Game gameTest = new Game();
	Language lang = new Language();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetWinner() {
		gameTest.Player1 = new Player("player1");
		gameTest.Player2 = new Player("player2");
		gameTest.Player1.addPoints(4000);
		
		gameTest.gameText = lang.languageSetup("Dansk.txt");
		
		String expected = String.format(gameTest.gameText.get("vinderTekst"), gameTest.Player1.getName(), gameTest.Player1.getPoints());
		
		String actual = gameTest.getWinner();
		
		assertEquals(expected, actual);
		
	}

	@Test //Tester om sumToPoints() giver det rigtige antal point for hvert slag.
	public void testSumToPoints() {
		gameTest.gameText = lang.languageSetup("Dansk.txt");
		
		int complete = 0;
		int[] feltvalue = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
		
		for(int i=2; i<13; i++) {
			int expected = feltvalue[i-2];
			int actual = gameTest.sumToPoints(i);
				if(expected == actual) {
					complete++;
				}
		}
		
		assertEquals(11, complete);
	}

}
