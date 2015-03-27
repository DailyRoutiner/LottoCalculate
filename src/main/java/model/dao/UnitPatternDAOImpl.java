package model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("UnitPatternDAO")
public class UnitPatternDAOImpl implements UnitPatternDAO {
	@Override
	public boolean updatePatternFrequency(String pattern) {
		SqlSession session = null;
		boolean result = false;
		try {
			session = DBUtil.getSqlSession();
			result = session.delete("UNITPATTERN.updatePatternFrequency", pattern) >= 0 ? true : false;
		} finally {
			DBUtil.closeSqlSession(result, session);
		}
		return result;
	}
}
