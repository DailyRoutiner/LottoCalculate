package model.dao;

import java.util.List;

import model.domain.NumeralStatsDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import util.DBUtil;


@Repository("NumeralStatsDAO")
public class NumeralStatsDAOImpl implements NumeralStatsDAO{

	@Override
	public List<NumeralStatsDTO> list(){
		SqlSession session = DBUtil.getSqlSession();
		List<NumeralStatsDTO> NumeralStatsDTO= null;
		
		try {
			NumeralStatsDTO = session.selectList("NUMERALSTATS.read");
		}finally{
			session.close();
		}
		
		return NumeralStatsDTO;
		
	}
	
	
/*	public int update(NumeralStatsDTO NumeralStats){
		int numeral_frequency = session.update("NumeralStats.update", NumeralStats);
		return numeral_frequency;
		};*/
		
		
}