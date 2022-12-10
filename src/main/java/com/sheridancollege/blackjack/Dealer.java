
package com.sheridancollege.blackjack;
import java.util.ArrayList;

public class Dealer extends GenericPlayer {

	//create one global object
	private static Dealer onlyObject=null;
	
	//private constructor
	private Dealer(){
	
	}
	
	private ArrayList<Card> deck;

	
	//using getInstance() method
	
	public static Dealer getInstance()
	{
		if(onlyObject==null)
		{
		onlyObject=new Dealer();
		}
		return onlyObject;
	}
	
	
	public void dealCards() {
		// TODO - implement Dealer.dealCards
		throw new UnsupportedOperationException();
	}

	public void shuffleCards() {
		// TODO - implement Dealer.shuffleCards
		throw new UnsupportedOperationException();
	}

	public ArrayList getDeck() {
		// TODO - implement Dealer.getDeck
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deck
	 */
	public void setDeck(ArrayList deck) {
		// TODO - implement Dealer.setDeck
		throw new UnsupportedOperationException();
	}

}
