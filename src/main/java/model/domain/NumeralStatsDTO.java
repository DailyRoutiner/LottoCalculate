package model.domain;

public class NumeralStatsDTO {
	private int numberId;
	private int numeralFrequency;
	private int turnFk;
	private String unitIdFk;

	public NumeralStatsDTO(){ }
	
	public NumeralStatsDTO(int numberId, int numeralFrequency, int turnFk, String unitIdFk) {
		this.numberId = numberId;
		this.numeralFrequency = numeralFrequency;
		this.turnFk = turnFk;
		this.unitIdFk = unitIdFk;
	}

	public int getNumberId() {
		return numberId;
	}

	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}

	public int getNumeralFrequency() {
		return numeralFrequency;
	}

	public void setNumeralFrequency(int numeralFrequency) {
		this.numeralFrequency = numeralFrequency;
	}

	public int getTurnFk() {
		return turnFk;
	}

	public void setTurnFk(int turnFk) {
		this.turnFk = turnFk;
	}

	public String getUnitIdFk() {
		return unitIdFk;
	}

	public void setUnitIdFk(String unitIdFk) {
		this.unitIdFk = unitIdFk;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NumeralStatsDTO [numberId=");
		builder.append(numberId);
		builder.append(", numeralFrequency=");
		builder.append(numeralFrequency);
		builder.append(", turnFk=");
		builder.append(turnFk);
		builder.append(", unitIdFk=");
		builder.append(unitIdFk);
		builder.append("]");
		return builder.toString();
	}
}