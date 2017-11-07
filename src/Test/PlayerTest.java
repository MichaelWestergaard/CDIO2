package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Game.Dice;
import Game.Player;

public class PlayerTest {
	
	Player player;
	Player Player1 = new Player();
	Player
	
	@Before
	public void setUp() throws Exception {
		player = new Player("TestPlayer");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAccount() { //
		Player1.getAccount();
		int expected;
		testDice1.rollDice();
		int faceValue = testDice1.getFaceValue();
		System.out.println(faceValue);
	}

	@Test
	public void testGetName() {		
		String expected = "TestPlayer";
		String actual = player.getName();
		
		assertEquals(expected, actual);
		
	}

}
