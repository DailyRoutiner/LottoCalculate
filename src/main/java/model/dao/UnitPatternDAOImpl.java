package model.dao;

import java.util.List;

import model.domain.UnitPatternDTO;

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

	@Override
	public boolean initialization() {
		SqlSession session = null;
		boolean result = false;
		try {
			session = DBUtil.getSqlSession();
			result = session.delete("UNITPATTERN.initialization") >= 0 ? true : false;
		} finally {
			DBUtil.closeSqlSession(result, session);
		}
		return result;
	}

	@Override
	public List<UnitPatternDTO> patternPriority() {
		SqlSession session = DBUtil.getSqlSession();
		List<UnitPatternDTO> patternList = null;
		try {
			patternList = session.selectList("UNITPATTERN.patternPriority");
		} finally {
			session.close();
		}
		return patternList;
	}
}
