package model.domain;

import java.io.Serializable;

public class RandomNumberDTO implements Serializable{
	private int randomNum;
	private String unitId;
	
	public RandomNumberDTO() {	}
	
	public RandomNumberDTO(int randomNum, String unitId) {
		this.randomNum = randomNum;
		this.unitId = unitId;
	}
	
	public int getRandomNum() {
		return randomNum;
	}
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
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
		builder.append("RandomNumberDTO [randomNum=");
		builder.append(randomNum);
		builder.append(", unitId=");
		builder.append(unitId);
		builder.append("]");
		return builder.toString();
	}
}
