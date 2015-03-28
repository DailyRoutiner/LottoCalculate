package model.service;


import java.util.List;

import javax.annotation.Resource;

import model.dao.UnitPatternDAO;
import model.domain.UnitPatternDTO;

import org.springframework.stereotype.Service;

@Service("UnitPatternService")
public class UnitPatternServiceImpl implements UnitPatternService{
	@Resource(name="UnitPatternDAO")
	private UnitPatternDAO unitPatternDao;

	@Override
	public boolean updatePatternFrequency(String pattern) {
		return unitPatternDao.updatePatternFrequency(pattern);
	}

	@Override
	public boolean initialization() {
		return unitPatternDao.initialization();
	}

	@Override
	public List<UnitPatternDTO> patternPriority() {
		return unitPatternDao.patternPriority();
	}	
}