package model.service;

import java.util.List;

import model.domain.RandomNumberDTO;

public interface RandomNumberService {
	List<RandomNumberDTO> randomNumber(RandomNumberDTO randomNumber);
}
