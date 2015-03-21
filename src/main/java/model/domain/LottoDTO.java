package model.domain;

import java.io.Serializable;

public class LottoDTO implements Serializable {
	private int numberId;
	private int numeralFrequency;
	private int trun;
	private String unitId;
	
	public LottoDTO() {
	}

	public LottoDTO(int numberId, String unitId) {
		this.numberId = numberId;
		this.unitId = unitId;
	}

	public LottoDTO(int numberId, int numeralFrequency, int trun, String unitId) {
		this.numberId = numberId;
		this.numeralFrequency = numeralFrequency;
		this.trun = trun;
		this.unitId = unitId;
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
	public int getTrun() {
		return trun;
	}
	public void setTrun(int trun) {
		this.trun = trun;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LottoDTO [numberId=");
		builder.append(numberId);
		builder.append(", numeralFrequency=");
		builder.append(numeralFrequency);
		builder.append(", trun=");
		builder.append(trun);
		builder.append(", unitId=");
		builder.append(unitId);
		builder.append("]");
		return builder.toString();
	}
}

