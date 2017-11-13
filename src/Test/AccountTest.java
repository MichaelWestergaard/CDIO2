package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Game.Account;

public class AccountTest {
	Account account = new Account();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //Tester om setBalance() kan håndtere positive værdier.
	public void testSetBalance_positiveNumber() {
		account.setBalance(500);
		
		int expected = 1500;
		int actual = account.getBalance();
		
		assertEquals(expected, actual);
		
	}	
	
	@Test //Tester om setBalance() kan håndtere negative værdier.
	public void testSetBalance_negativeNumber() {
		account.setBalance(-500);
		
		int expected = 500;
		int actual = account.getBalance();
		
		assertEquals(expected, actual);
		
	}	
	
	@Test //Tester om setBalance() kan håndtere værdien 0.
	public void testSetBalance_zero() {
		account.setBalance(0);
		
		int expected = 1000;
		int actual = account.getBalance();
		
		assertEquals(expected, actual);
		
	}	
	
	@Test //Test hvorvidt getBalance() metoden returner den rigtige værdi.
	public void testGetBalance() {
		int expected = 1000;
		int actual = account.getBalance();
		
		assertEquals(expected, actual);
		
	}

}
