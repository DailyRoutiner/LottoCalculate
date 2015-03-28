package model.dao;

import java.util.List;

import model.domain.EndNumberDTO;

public interface EndNumberDAO {
	List<EndNumberDTO> totalNumberList();
	List<EndNumberDTO> tenNumberList();
}
