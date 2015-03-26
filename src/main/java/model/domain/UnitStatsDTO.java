package model.domain;

import java.io.Serializable;

public class UnitStatsDTO implements Serializable{
	private String unitId;
	private int unitNumber;
	private int unitFrequency;
	
	public UnitStatsDTO() { }
	
	public UnitStatsDTO(String unitId) {
		this.unitId = unitId;
	}

	public UnitStatsDTO(String unitId, int unitFrequency) {
		this.unitId = unitId;
		this.unitNumber = unitFrequency;
	}
	
	public UnitStatsDTO(String unitId, int unitNumber, int unitFrequency) {
		this.unitId = unitId;
		this.unitNumber = unitNumber;
		this.unitFrequency = unitFrequency;
	}
	
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public int getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	public int getUnitFrequency() {
		return unitFrequency;
	}
	public void setUnitFrequency(int unitFrequency) {
		this.unitFrequency = unitFrequency;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnitSatatsDTO [unitId=");
		builder.append(unitId);
		builder.append(", unitNumber=");
		builder.append(unitNumber);
		builder.append(", unitFrequency=");
		builder.append(unitFrequency);
		builder.append("]");
		return builder.toString();
	}
}