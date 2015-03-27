package model.service;

import java.util.List;

import model.domain.UnitStatsDTO;

public interface UnitStatsService {
	List<UnitStatsDTO> unitPriority(int number);
	boolean updateUnitFrequency(String unitId);
}
