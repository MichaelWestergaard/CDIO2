package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Game.Game;
import Game.Player;
import Game.Dice;

public class GameTest {
	
	Game game;
	Player testPlayer = new Player("test");
	Dice testDice = new Dice();

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
		int[] rolls = new int[1000];
		int twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0, sevenCount = 0, eightCount = 0, nineCount = 0,
			tenCount = 0, elevenCount = 0, twelveCount = 0;
		
		for (int i = 0; i < 1000; i++) {
			
			testDice.rollDice();
			rolls[i] = testDice.getSum();
			switch(rolls[i]) {
			case 2:
				twoCount++;
				break;
			case 3:
				threeCount++;
				break;
			case 4:
				fourCount++;
				break;
			case 5:
				fiveCount++;
				break;
			case 6:
				sixCount++;
				break;
			case 7:
				sevenCount++;
				break;
			case 8:
				eightCount++;
				break;
			case 9:
				nineCount++;
				break;
			case 10:
				tenCount++;
				break;
			case 11:
				elevenCount++;
				break;
			case 12:
				twelveCount++;
				break;
	}

	@Test
	public void testPlayTurn() {
		;
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
