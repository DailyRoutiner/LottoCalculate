package model.domain;

public class EndNumberDTO {
	private String winningNumber;
	
	public EndNumberDTO() {
		super();
	}

	public EndNumberDTO(String winningNumber) {
		super();
		this.winningNumber = winningNumber;
	}

	public String getWinningNumber() {
		return winningNumber;
	}

	public void setWinningNumber(String winningNumber) {
		this.winningNumber = winningNumber;
	}

	@Override
	public String toString() {
		return "EndNumberDTO [winningNumber=" + winningNumber + "]";
	}

}