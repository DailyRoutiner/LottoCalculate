package model.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.annotation.Resource;

import model.dao.UnitPatternDAO;
import model.dao.UnitStatsDAO;
import model.domain.UnitPatternDTO;
import model.domain.UnitStatsDTO;

import org.springframework.stereotype.Service;

@Service("UnitPatternService")
public class UnitPatternServiceImpl implements UnitPatternService{
	@Resource(name="UnitPatternDAO")
	private UnitPatternDAO unitPatternDao;
	@Resource(name="UnitStatsDAO")
	private UnitStatsDAO unitStatsDAO;
	

	@Override
	public boolean updatePatternFrequency(String pattern) {
		return unitPatternDao.updatePatternFrequency(pattern);
	}

	@Override
	public boolean initialization() {
		return unitPatternDao.initialization();
	}

	//끝수패턴으로 (단위+패턴) 정보 전달 - Map 형태
	@Override
	public Map<String, Integer> patternPriority() {
			List<UnitStatsDTO> unitList = unitStatsDAO.unitPriority(5);
			Map<String, Integer> hashMap = new HashMap<String, Integer>();

			String pattern = unitPatternDao.patternPriority().get(0).getPattern(); 
			pattern = pattern.replaceAll(" ", "");
			pattern = pattern.substring(1, 10);
			pattern = pattern.replaceAll("0,", "");

			String token = null;
			StringTokenizer st = new StringTokenizer(pattern, ",");
			int temp[] = new int[5];
			int i = 0;
			
			while(st.hasMoreTokens()){
				token = st.nextToken();
				int number = Integer.parseInt(token);
				temp[i]=number;
				i++;
			}

			int z = i-1;
			
			for(int j=0; j<i; j++){
				hashMap.put(unitList.get(j).getUnitId(), temp[z]);
				z--;
			}
			
			return hashMap;
		
	}	
}