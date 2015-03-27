package model.domain;

import java.io.Serializable;

public class UnitPatternDTO implements Serializable{
	private int patternId;
	private int unitNumber;
	private String pattern;
	private int patternFrequency;
	
	public UnitPatternDTO() { }

	public UnitPatternDTO(String pattern) {
		this.pattern = pattern;
	}

	public UnitPatternDTO(int patternId, int unitNumber, String pattern, int patternFrequency) {
		this.patternId = patternId;
		this.unitNumber = unitNumber;
		this.pattern = pattern;
		this.patternFrequency = patternFrequency;
	}

	public int getPatternId() {
		return patternId;
	}

	public void setPatternId(int patternId) {
		this.patternId = patternId;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public int getPatternFrequency() {
		return patternFrequency;
	}

	public void setPatternFrequency(int patternFrequency) {
		this.patternFrequency = patternFrequency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnitPatternDTO [patternId=");
		builder.append(patternId);
		builder.append(", unitNumber=");
		builder.append(unitNumber);
		builder.append(", pattern=");
		builder.append(pattern);
		builder.append(", patternFrequency=");
		builder.append(patternFrequency);
		builder.append("]");
		return builder.toString();
	}
}