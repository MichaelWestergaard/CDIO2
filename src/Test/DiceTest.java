package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.Dice;

public class DiceTest {

	Dice testDice1 = new Dice();
	Dice testDice2 = new Dice();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test

	//Test af 'raflebægeret' (diceRoll funktionen) hen over 1000 kast,
	//samt hvorvidt de stemmer overens med den teoretiske sandsynlighed.

	public void testRollDice() {
		int[] rolls = new int[1000];
		int twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0, sevenCount = 0, eightCount = 0, nineCount = 0,
				tenCount = 0, elevenCount = 0, twelveCount = 0;

		for (int i = 0; i < 1000; i++) {

			testDice1.rollDice();
			testDice2.rollDice();
			rolls[i] = testDice1.getFaceValue() + testDice2.getFaceValue();
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
		}

		System.out.println("2: " + twoCount + " ~ " + (double)twoCount/1000*100);			//Sandsynligheden bør være 2,78%
		System.out.println("3: " + threeCount + " ~ " + (double)threeCount/1000*100);		//Sandsynligheden bør være 5,56% 
		System.out.println("4: " + fourCount + " ~ " + (double)fourCount/1000*100);  		//Sandsynligheden bør være 8,33%
		System.out.println("5: " + fiveCount + " ~ " + (double)fiveCount/1000*100);  		//Sandsynligheden bør være 11,11%
		System.out.println("6: " + sixCount + " ~ " + (double)sixCount/1000*100);   		//Sandsynligheden bør være 13,89%
		System.out.println("7: " + sevenCount + " ~ " + (double)sevenCount/1000*100);		//Sandsynligheden bør være 16,67%
		System.out.println("8: " + eightCount + " ~ " + (double)eightCount/1000*100);		//Sandsynligheden bør være 13,89%
		System.out.println("9: " + nineCount + " ~ " + (double)nineCount/1000*100);			//Sandsynligheden bør være 11,11%
		System.out.println("10: " + tenCount + " ~ " + (double)tenCount/1000*100);			//Sandsynligheden bør være 8,33%
		System.out.println("11: " + elevenCount + " ~ " + (double)elevenCount/1000*100);	//Sandsynligheden bør være 5,56%
		System.out.println("12: " + twelveCount + " ~ " + (double)twelveCount/1000*100);	//Sandsynligheden bør være 2,78%
	}

	@Test
	public void testGetFaceValue() { //skal teste terningen, således for at finde ud af om terningen faktisk lægger inden for 1-6 
		int expected;
		testDice1.rollDice();
		int faceValue = testDice1.getFaceValue();
		System.out.println(faceValue);
		switch(faceValue){
		case 1:
			expected = 1;
			assertEquals(expected, faceValue);
			break;
		case 2:
			expected = 2;
			assertEquals(expected, faceValue);
			break;
		case 3:
			expected = 3;
			assertEquals(expected, faceValue);
			break;
		case 4:
			expected = 4;
			assertEquals(expected, faceValue);
			break;
		case 5:
			expected = 5;
			assertEquals(expected, faceValue);
			break;
		case 6:
			expected = 6;
			assertEquals(expected, faceValue);
			break;
			
			default:
			fail("Tallet ligger ikke inden for 1-6");
		}
		
	}
}
