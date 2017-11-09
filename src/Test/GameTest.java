package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.Game;
import Game.Language;

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
		fail("Not yet implemented");
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
