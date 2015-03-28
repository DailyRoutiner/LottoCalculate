package model.dao;

import java.util.List;

import model.domain.TotalResultDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("TotalResultDAO")
public class TotalResultDAOImpl implements TotalResultDAO{

	@Override
	public List<TotalResultDTO> selectWinningNumber() {
		SqlSession session = DBUtil.getSqlSession();
		List<TotalResultDTO> totalResultList = null;
		try {
			totalResultList = session.selectList("TOTALRESULT.selectWinningNumber");
		} finally {
			session.close();
		}
		return totalResultList;
	}
}
