package model.service;

import java.util.List;

import javax.annotation.Resource;

import model.dao.UnitStatsDAO;
import model.domain.UnitStatsDTO;

import org.springframework.stereotype.Service;

@Service("UnitStatsService")
public class UnitStatsServiceImpl implements UnitStatsService{
	@Resource(name="UnitStatsDAO")
	private UnitStatsDAO unitStatsDao;

	@Override
	public List<UnitStatsDTO> unitPriority() {
		List<UnitStatsDTO> unitList = unitStatsDao.unitPriority();
		for(UnitStatsDTO d : unitList){
			System.out.println(d);
		}
		return unitStatsDao.unitPriority();
	}

	@Override
	public boolean updateUnitFrequency(String unitId) {
		return unitStatsDao.updateUnitFrequency(unitId);
	}	
}