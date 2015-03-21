package model.dao;

import java.util.List;

import model.domain.LottoDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("LottoDAO")
public class LottoDAOImpl implements LottoDAO {
	@Override
	public List<LottoDTO> LottoNumList() {
		SqlSession session = DBUtil.getSqlSession();
		List<LottoDTO> spendList = null;
		try {
			spendList = session.selectList("LOTTO.lottoNumList");
		} finally {
			session.close();
		}
		return spendList;
	}

	@Override
	public List<LottoDTO> sectionPriority() {
		SqlSession session = DBUtil.getSqlSession();
		List<LottoDTO> spendList = null;
		try {
			spendList = session.selectList("LOTTO.sectionPriority");
		} finally {
			session.close();
		}
		return spendList;
	}
}
