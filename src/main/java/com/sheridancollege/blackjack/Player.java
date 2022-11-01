package com.sheridancollege.blackjack;
import java.util.ArrayList;

public class Player extends GenericPlayer {

	private String name;
	private Int bet;
	private Int money;

	/**
	 * 
	 * @param name
	 */
	public Player(String name) {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Int getBet() {
		return this.bet;
	}

	/**
	 * 
	 * @param bet
	 */
	public void setBet(Int bet) {
		this.bet = bet;
	}

	public int getMoney() {
		// TODO - implement Player.getMoney
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param money
	 */
	public void setMoney(Int money) {
		this.money = money;
	}

	public void doubleDown() {
		// TODO - implement Player.doubleDown
		throw new UnsupportedOperationException();
	}

	public void insurance() {
		// TODO - implement Player.insurance
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement Player.operation
		throw new UnsupportedOperationException();
	}

}