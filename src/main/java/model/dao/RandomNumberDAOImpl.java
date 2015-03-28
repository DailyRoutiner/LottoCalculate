package model.dao;

import java.util.List;

import model.domain.RandomNumberDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("RandomNumberDAO")
public class RandomNumberDAOImpl implements RandomNumberDAO {
	@Override
	public List<RandomNumberDTO> randomNumber(RandomNumberDTO randomNumber) {
		SqlSession session = DBUtil.getSqlSession();
		List<RandomNumberDTO> unitList = null;
		try {
			unitList = session.selectList("NUMERALSTATS.randomNumber", randomNumber);
		} finally {
			session.close();
		}
		return unitList;
	}
}
