package model.service;

import java.util.List;
import java.util.Map;

import model.domain.UnitPatternDTO;

public interface UnitPatternService {
	boolean updatePatternFrequency(String pattern);
	boolean initialization();
	Map<String, Integer> patternPriority();
}
