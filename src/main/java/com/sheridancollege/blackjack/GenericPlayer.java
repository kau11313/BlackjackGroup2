package com.sheridancollege.blackjack;
import java.util.ArrayList;

public class GenericPlayer {
	
	//making one global object
	private static GenericPlayer onlyObject=null;

	private ArrayList<Card> hand;
	private ArrayList<Card> second_hand;
	
	//making constructor private
	
	private GenericPlayer(){
	}
          
	// using getInstance() method
	
	public static GenericPlayer getInstance(){
              if(onlyObject==null)
	      {
		      onlyObject=new GenericPlayer();
	      }
		return onlyObject;
	}
	
	
	public ArrayList getHand() {
		// TODO - implement GenericPlayer.getHand
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hand
	 */
	public void setHand(ArrayList hand) {
		// TODO - implement GenericPlayer.setHand
		throw new UnsupportedOperationException();
	}

	public ArrayList getSecondHand() {
		// TODO - implement GenericPlayer.getSecondHand
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param second_hand
	 */
	public void setSecondHand(ArrayList second_hand) {
		// TODO - implement GenericPlayer.setSecondHand
		throw new UnsupportedOperationException();
	}

	public void hit() {
		// TODO - implement GenericPlayer.hit
		throw new UnsupportedOperationException();
	}

	public void stand() {
		// TODO - implement GenericPlayer.stand
		throw new UnsupportedOperationException();
	}

}
