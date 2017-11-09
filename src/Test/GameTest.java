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

	Game game;
	Language lang;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetWinner() {
		Player Player1, Player2;
		game = new Game();
		lang = new Language();
		game.gameText = lang.languageSetup("Dansk.txt");
		
		if (Player1.getPoints() > Player2.getPoints()) {
			return String.format(gameText.get("vinderTekst"), Player1.getName(), Player1.getPoints();
		} else {
			return String.format(gameText.get("vinderTekst"), Player2.getName(), Player2.getPoints();
		}
	}

	@Test //Tester om sumToPoints() giver det rigtige antal point for hvert slag.
	public void testSumToPoints() {
		game = new Game();
		lang = new Language();
		game.gameText = lang.languageSetup("Dansk.txt");
		
		int complete = 0;
		int[] feltvalue = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
		
		for(int i=2; i<13; i++) {
			int expected = feltvalue[i-2];
			int actual = game.sumToPoints(i);
				if(expected == actual) {
					complete++;
				}
		}
		
		assertEquals(11, complete);
	}

}
