package com.company.challenge1.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bean {
	private String gameId;
	private String 	word;
	private int guessesLeft;
	private boolean active;
	private String msg;
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getGuessesLeft() {
		return guessesLeft;
	}
	public void setGuessesLeft(int guessesLeft) {
		this.guessesLeft = guessesLeft;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

	
}
