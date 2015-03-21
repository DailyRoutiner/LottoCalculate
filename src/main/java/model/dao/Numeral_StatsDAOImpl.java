package model.dao;

import model.domain.Numeral_StatsDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class Numeral_StatsDAOImpl implements Numeral_StatsDAO{

	@Autowired
	SqlSession session;
	
	public int update(Numeral_StatsDTO Numeral_Stats){
		// TODO Auto-generated method stub
		
		int numeral_frequency = session.update("Numeral_Stats.update", Numeral_Stats);
		
		return numeral_frequency;
		
		};
	
	
}