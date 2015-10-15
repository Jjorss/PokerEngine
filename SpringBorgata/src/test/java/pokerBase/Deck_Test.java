package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		int iDeckSize = 52;
		Deck d = new Deck(false);
		assertTrue(d.getTotalCards() == iDeckSize);		
	}
	
	@Test
	public void DrawOne() {
		int iDeckSize = 52;
		int iDeckSizeDrawOne = 51;
		
		Deck d = new Deck(false);
		assertTrue(d.getTotalCards() == iDeckSize);
		d.drawFromDeck();
		
		assertTrue(d.getTotalCards() == iDeckSizeDrawOne);
		
	}
	@Test
	public void TestJokerDeck() {
		Deck d1 = new Deck(2, false);
		int deckSize1 = 54;
		
		Deck d2 = new Deck(48, false);
		int deckSize2 = 100;
		
		assertTrue(d1.getTotalCards() == deckSize1);
		assertTrue(d2.getTotalCards() == deckSize2);
	}
	
	public static Boolean checkWilds(Deck deck){
		int wildCards = 0;
		for(int i = 0; i<deck.getCards().size(); i++){
			if(deck.getCards().get(i).getWild()){
				wildCards++;
			}
		}
		if(wildCards == 4){
			return true;
		}
		return false;
	}
	
	@Test
	public void TestWildDeck() {
		Deck d1 = new Deck(true);
		
		System.out.println(d1.getTotalCards());
		assertTrue(d1.getTotalCards() == 52);
		assertTrue(checkWilds(d1));
	}
	

}
