package model.domain;

import java.io.Serializable;

public class LottoDTO implements Serializable {
	private int lottonumber;
	private int count;
	
	public LottoDTO() {
		super();
	}
	public LottoDTO(int lottonumber, int count) {
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
		return "LottoDTO [lottonumber=" + lottonumber + ", count=" + count
				+ "]";
	}
}

