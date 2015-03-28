package model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.domain.EndNumberDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("EndNumberDAO")
public class EndNumberDAOImpl implements EndNumberDAO {
	private Map<Integer, Integer> turn = new HashMap<Integer, Integer>();
	private Map<Integer, Integer> turn10 = new HashMap<Integer, Integer>();
	private int[] temp = new int[6]; 
	
	@Override
	public Map<Integer,Integer> totalNumberList() {
		SqlSession session = DBUtil.getSqlSession();
		List<EndNumberDTO> endList = null;
		try {
			endList = session.selectList("ENDNUMBER.selectEndNumber");
			
			if(turn.isEmpty()){
				// 총 끝수 샘
				for (EndNumberDTO d : endList) {
					String[] str = d.getWinningNumber().split("/");

					for (int t = 0; t < str.length; t++)
						temp[t] = Integer.parseInt(str[t]);

					for (int i = 0; i < temp.length; i++) {
						int sameCount = 0;
						for (int j = 0; j < temp.length; j++) {
							if (temp[i] % 10 == temp[j] % 10) {
								sameCount++;
							}
						}

						if (sameCount == 1) {
							if (!turn.containsKey(temp[i] % 10)) { // 해당 끝수번호 포함 확인
								turn.put(temp[i] % 10, 1);
							} else {
								int t = turn.get(temp[i] % 10) + 1;
								turn.remove(temp[i] % 10);
								turn.put(temp[i] % 10, t);
							}
						}
					}
				}
			}
		} finally {
			session.close();
		}
		return turn;
	}

	@Override
	public Map<Integer, Integer> tenNumberList() {
		SqlSession session = DBUtil.getSqlSession();
		List<EndNumberDTO> endList2 = null;
		try {
			endList2 = session.selectList("ENDNUMBER.selectTenEndNumber");
			if(turn10.isEmpty()){
				// 10개의 끝수 샘플
				for (EndNumberDTO d : endList2) {
					String[] str = d.getWinningNumber().split("/");

					for (int t = 0; t < str.length; t++)
						temp[t] = Integer.parseInt(str[t]);

					for (int i = 0; i < temp.length; i++) {
						int sameCount = 0;
						for (int j = 0; j < temp.length; j++) {
							if (temp[i] % 10 == temp[j] % 10) {
								sameCount++;
							}
						}

						if (sameCount == 1) {
							if (!turn10.containsKey(temp[i] % 10)) { // 해당 끝수번호 포함
																		// 확인
								turn10.put(temp[i] % 10, 1);
							} else {
								int t = turn10.get(temp[i] % 10) + 1;
								turn10.remove(temp[i] % 10);
								turn10.put(temp[i] % 10, t);
							}
						}
					}
				}
			}
		} finally {
			session.close();
		}
		return turn10;
	
	}
	
}
