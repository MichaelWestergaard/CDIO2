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

	@Test //Tester om getPoint() returnerer den korrekte værdi.
	public void testGetPoints() {
		int expected = 1000;
		int actual = player.getPoints();
		
		assertEquals(expected, actual);	
	}
	
	@Test //Tester om addPoint() virker med positive tal.
	public void testAddPoints_positive() {
		player.addPoints(500);
		int expected = 1500;
		int actual = player.getPoints();
		
		assertEquals(expected, actual);
	}
	
	@Test //Tester om addPoints() virker med negative tal, og om der bliver returneret en negativ værdi eller 0.
	public void testAddPoints_negative() {
		player.addPoints(-1500);
		int expected = 0;
		int actual = player.getPoints();
		
		assertEquals(expected, actual);
		
	}
	
	@Test //Tester om addPoints() virker med 0.
	public void testAddPoints_zero() {
		player.addPoints(0);
		int expected = 1000;
		int actual = player.getPoints();
		
		assertEquals(expected, actual);
		
	}
	
	@Test //Tester om getName() returnerer den rigtige string.
	public void testGetName() {		
		String expected = "TestPlayer";
		String actual = player.getName();
		
		assertEquals(expected, actual);
	}

}
