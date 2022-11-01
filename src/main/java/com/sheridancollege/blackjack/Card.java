package com.sheridancollege.blackjack;

public class Card {

	private Suit suit;
	private Value value;

	/**
	 * 
	 * @param suit
	 * @param value
	 */
	public Card(Suit suit, Value value) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	public Suit getSuit() {
		return this.suit;
	}

	/**
	 * 
	 * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public void getValue() {
		// TODO - implement Card.getValue
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(Value value) {
		this.value = value;
	}

}