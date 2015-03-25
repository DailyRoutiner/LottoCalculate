package model.dao;

import model.domain.NumeralStatsDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class NumeralStatsDAOImpl implements NumeralStatsDAO{

	@Autowired
	SqlSession session;
	
	public int update(NumeralStatsDTO NumeralStats){
		// TODO Auto-generated method stub
		
		int numeral_frequency = session.update("NumeralStats.update", NumeralStats);
		
		return numeral_frequency;
		
		};
	
	
}