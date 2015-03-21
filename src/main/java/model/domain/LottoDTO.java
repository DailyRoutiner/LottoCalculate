package model.domain;

import java.io.Serializable;

public class LottoDTO implements Serializable {
	private int lottonumber;
	private int count;
	private int sectionId;
	
	public LottoDTO() {
		super();
	}
	public LottoDTO(int lottonumber, int count, int sectionId) {
		super();
		this.lottonumber = lottonumber;
		this.count = count;
		this.sectionId = sectionId;
	}
	public int getLottonumber() {
		return lottonumber;
	}
	public void setLottonumber(int lottonumber) {
		this.lottonumber = lottonumber;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LottoDTO [lottonumber=");
		builder.append(lottonumber);
		builder.append(", count=");
		builder.append(count);
		builder.append(", sectionId=");
		builder.append(sectionId);
		builder.append("]");
		return builder.toString();
	}

}

