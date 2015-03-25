package model.dao;

import java.util.List;
import model.domain.UnitStatsDTO;

public interface UnitStatsDAO {
	List<UnitStatsDTO> unitPriority();
	boolean updateUnitFrequency(String unitId);
}


