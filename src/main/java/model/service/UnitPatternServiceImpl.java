package model.service;


import javax.annotation.Resource;
import model.dao.UnitPatternDAO;

import org.springframework.stereotype.Service;

@Service("UnitPatternService")
public class UnitPatternServiceImpl implements UnitPatternService{
	@Resource(name="UnitPatternDAO")
	private UnitPatternDAO unitPatternDao;

	@Override
	public boolean updatePatternFrequency(String pattern) {
		return unitPatternDao.updatePatternFrequency(pattern);
	}	
}