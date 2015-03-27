package model.domain;

import java.io.Serializable;

public class TotalResultDTO implements Serializable{
	private int turn;
	private String winningNumber;
	private String bonusNumber;

	public TotalResultDTO() {	}
	
	public TotalResultDTO(String winningNumber) {
		this.winningNumber = winningNumber;
	}
	
	public TotalResultDTO(int turn, String winningNumber, String bonusNumber) {
		this.turn = turn;
		this.winningNumber = winningNumber;
		this.bonusNumber = bonusNumber;
	}
	
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public String getWinningNumber() {
		return winningNumber;
	}
	public void setWinningNumber(String winningNumber) {
		this.winningNumber = winningNumber;
	}
	public String getBonusNumber() {
		return bonusNumber;
	}
	public void setBonusNumber(String bonusNumber) {
		this.bonusNumber = bonusNumber;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TotalResultDTO [turn=");
		builder.append(turn);
		builder.append(", winningNumber=");
		builder.append(winningNumber);
		builder.append(", bonusNumber=");
		builder.append(bonusNumber);
		builder.append("]");
		return builder.toString();
	}
}
