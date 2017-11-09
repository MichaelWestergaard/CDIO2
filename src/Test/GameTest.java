package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.Game;

public class GameTest {

	Game game = new Game();
	
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

	@Test
	public void testSumToPoints() {		
		//game = new Game();
		//int complete = 0;
		//int[] feltvalue = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
		int sum = 2;
		
		
		//for(int i=2; i<13; i++) {
			//int expected = 250;
			//int actual = game.sumToPoints(sum);
			//if(expected == actual) {
				//complete++;
			//}
			//System.out.println(complete);
		//}
		
		System.out.println(game.sumToPoints(sum));
		
		//assertEquals(expected, actual);
		
	}

}
