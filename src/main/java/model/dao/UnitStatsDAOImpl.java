package model.dao;

import java.util.List;

import model.domain.UnitStatsDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("UnitStatsDAO")
public class UnitStatsDAOImpl implements UnitStatsDAO {

	@Override
	public List<UnitStatsDTO> unitPriority(int number) {
		SqlSession session = DBUtil.getSqlSession();
		List<UnitStatsDTO> unitList = null;
		try {
			unitList = session.selectList("UNITSTATS.unitPriority", number);
		} finally {
			session.close();
		}
		return unitList;
	}

	@Override
	public boolean updateUnitFrequency(String unitId) {
		SqlSession session = null;
		boolean result = false;
		try {
			session = DBUtil.getSqlSession();
			result = session.delete("UNITSTATS.updateUnitFrequency", unitId) >= 0 ? true : false;
		} finally {
			DBUtil.closeSqlSession(result, session);
		}
		return result;
	}
}
