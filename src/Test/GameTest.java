package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Game.Game;
import Game.Player;

public class GameTest {
	
	Game game;
	Player testPlayer = new Player("test");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGameSetup() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlayGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testRollDice() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlayTurn() {
		fail("Not yet implemented");
	}

	@Test
	public void testPressEnter() {
		fail("Not yet implemented");
	}

	@Test
	public void testShowScore() {
		int expected = 1000;
		int actual = testPlayer.getPoints();
		
		assertEquals(expected, actual);
	}

}
