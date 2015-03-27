package model.domain;

import java.io.Serializable;

public class UnitStatsDTO implements Serializable{
	private String unitId;
	private int unitRange;
	private int unitFrequency;
		
	public UnitStatsDTO() {	}
	
	public UnitStatsDTO(String unitId) {
		this.unitId = unitId;
	}

	public UnitStatsDTO(String unitId, int unitFrequency) {
		this.unitId = unitId;
		this.unitFrequency = unitFrequency;
	}

	public UnitStatsDTO(String unitId, int unitRange, int unitFrequency) {
		this.unitId = unitId;
		this.unitRange = unitRange;
		this.unitFrequency = unitFrequency;
	}
	
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public int getUnitRange() {
		return unitRange;
	}
	public void setUnitRange(int unitRange) {
		this.unitRange = unitRange;
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
		builder.append("UnitStatsDTO [unitId=");
		builder.append(unitId);
		builder.append(", unitRange=");
		builder.append(unitRange);
		builder.append(", unitFrequency=");
		builder.append(unitFrequency);
		builder.append("]");
		return builder.toString();
	}
}