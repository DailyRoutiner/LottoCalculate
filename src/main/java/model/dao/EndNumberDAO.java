package model.dao;

import java.util.List;
import java.util.Map;

import model.domain.EndNumberDTO;

public interface EndNumberDAO {
	Map<Integer,Integer> totalNumberList();
	Map<Integer,Integer> tenNumberList();
}
