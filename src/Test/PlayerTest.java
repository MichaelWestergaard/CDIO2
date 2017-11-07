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

	@Test
	public void testGetAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {		
		String expected = "TestPlayer";
		String actual = player.getName();
		
		assertEquals(expected, actual);
		
	}

}
