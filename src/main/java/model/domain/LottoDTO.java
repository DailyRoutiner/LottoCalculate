package model.domain;

import java.io.Serializable;

public class LottoDTO implements Serializable {
	private int lottonumber;
	private int count;
	
	public LottoDTO() {
		super();
	}
	public LottoDTO(int lottonumber, int count, int sectionId) {
		super();
		this.lottonumber = lottonumber;
		this.count = count;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LottoDTO [lottonumber=");
		builder.append(lottonumber);
		builder.append(", count=");
		builder.append(count);
		builder.append("]");
		return builder.toString();
	}

}

