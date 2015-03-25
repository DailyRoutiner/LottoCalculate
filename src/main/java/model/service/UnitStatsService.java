package model.service;

import java.util.List;

import model.domain.UnitStatsDTO;

public interface UnitStatsService {
	List<UnitStatsDTO> unitPriority();
	boolean updateUnitFrequency(String unitId);
}
