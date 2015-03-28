package model.dao;

import java.util.List;

import model.domain.RandomNumberDTO;

public interface RandomNumberDAO {
	List<RandomNumberDTO> randomNumber(RandomNumberDTO randomNumber);
}


