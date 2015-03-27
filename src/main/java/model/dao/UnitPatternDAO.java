package model.dao;

import java.util.List;

import model.domain.UnitPatternDTO;

public interface UnitPatternDAO {
	boolean updatePatternFrequency(String pattern);
	boolean initialization();
	List<UnitPatternDTO> patternPriority();
}