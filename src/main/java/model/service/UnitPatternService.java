package model.service;

import java.util.List;

import model.domain.UnitPatternDTO;

public interface UnitPatternService {
	boolean updatePatternFrequency(String pattern);
	boolean initialization();
	List<UnitPatternDTO> patternPriority();
}
