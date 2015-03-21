package model.domain;

public class Numeral_StatsDTO {
	
	private int number_id;
	private int numeral_frequency;
	private int turn_fk;
	private String unit_id_fk;
	
	public Numeral_StatsDTO(){
		
	}
	
	public Numeral_StatsDTO(int number_id, int numeral_frequency, int turn_fk,
			String unit_id_fk) {
		super();
		this.number_id = number_id;
		this.numeral_frequency = numeral_frequency;
		this.turn_fk = turn_fk;
		this.unit_id_fk = unit_id_fk;
	}

	
	public int getNumber_id() {
		return number_id;
	}
	public void setNumber_id(int number_id) {
		this.number_id = number_id;
	}
	public int getNumeral_frequency() {
		return numeral_frequency;
	}
	public void setNumeral_frequency(int numeral_frequency) {
		this.numeral_frequency = numeral_frequency;
	}
	public int getTurn_fk() {
		return turn_fk;
	}
	public void setTurn_fk(int turn_fk) {
		this.turn_fk = turn_fk;
	}
	public String getUnit_id_fk() {
		return unit_id_fk;
	}
	public void setUnit_id_fk(String unit_id_fk) {
		this.unit_id_fk = unit_id_fk;
	}
	
	

	
	
}
