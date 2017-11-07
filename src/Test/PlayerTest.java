package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Game.Player;

public class PlayerTest {
	
	Player player;
	
	@Before
	public void setUp() throws Exception {
		player = new Player("TestPlayer");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //Tester hvorvidt man for objektet player kan kalde metoden getAccount() for at ændre i playerens balance.
	public void testGetAccount() {
		player.getAccount().setBalance(200);
		int expected = 1200;
		int actual = player.getAccount().getBalance();
		assertEquals(expected, actual);
	}

	@Test //Tester om getName() returnerer den rigtige string.
	public void testGetName() {		
		String expected = "TestPlayer";
		String actual = player.getName();
		
		assertEquals(expected, actual);
		
	}

}
