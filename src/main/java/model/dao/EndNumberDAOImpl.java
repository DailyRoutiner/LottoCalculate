package model.dao;

import java.util.List;

import model.domain.EndNumber;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("EndNumberDAO")
public class EndNumberDAOImpl implements EndNumberDAO {

	@Override
	public List<EndNumber> numberList() {
		SqlSession session = DBUtil.getSqlSession();
		List<EndNumber> endList = null;
		try {
			endList = session.selectList("ENDNUMBER.selectEndNumber");
		} finally {
			session.close();
		}
		return endList;
	}

}
